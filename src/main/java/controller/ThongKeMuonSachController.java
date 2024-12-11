package controller;

import model.TheMuonSach;
import service.TheMuonSachService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/thong-ke-muon-sach")
public class ThongKeMuonSachController extends HttpServlet {

    private TheMuonSachService theMuonSachService = new TheMuonSachService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<TheMuonSach> danhSachMuonSach = theMuonSachService.getAllTheMuonSach();
        request.setAttribute("danhSachMuonSach", danhSachMuonSach);
        request.getRequestDispatcher("/thongKeMuonSach.jsp").forward(request, response);
    }
}
