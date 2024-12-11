package controller;

import model.TheMuonSach;
import service.SachService;
import service.TheMuonSachService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/muon-sach")
public class MuonSachServlet extends HttpServlet {
    private SachService sachService = new SachService();
    private TheMuonSachService theMuonSachService = new TheMuonSachService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maHocSinh = request.getParameter("maHocSinh");
        String maSach = request.getParameter("maSach");
        String ngayMuon = request.getParameter("ngayMuon");

        TheMuonSach theMuonSach = new TheMuonSach("TM" + System.currentTimeMillis(), maSach, maHocSinh, true, ngayMuon, null);
        if(theMuonSachService.add(theMuonSach) && sachService.decreaseSoLuongSach(maSach)) {
            response.sendRedirect("/danh-sach-sach");
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Không thể mượn sách.");
        }
    }
}
