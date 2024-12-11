package controller;

import model.Sach;
import service.SachService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/danh-sach-sach")
public class SachServlet extends HttpServlet {
    private SachService sachService = new SachService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Sach> danhSachSach = sachService.getAll();
        request.setAttribute("danhSachSach", danhSachSach);
        request.getRequestDispatcher("/WEB-INF/views/danhSachSach.jsp").forward(request, response);
    }
}
