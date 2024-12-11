<%@ page import="model.Sach" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h1>Danh Sách Sách</h1>
<table>
    <tr>
        <th>Mã sách</th>
        <th>Tên sách</th>
        <th>Tác giả</th>
        <th>Số lượng</th>
    </tr>
    <%
        List<Sach> danhSachSach = (List<Sach>) request.getAttribute("danhSachSach");
        for(Sach sach : danhSachSach) {
    %>
    <tr>
        <td><%= sach.getMaSach() %></td>
        <td><%= sach.getTenSach() %></td>
        <td><%= sach.getTacGia() %></td>
        <td><%= sach.getSoLuong() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
