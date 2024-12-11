<%@ page import="model.TheMuonSach" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h1>Thống Kê Mượn Sách</h1>
<table border="1">
  <tr>
    <th>Mã thẻ mượn</th>
    <th>Mã sách</th>
    <th>Mã học sinh</th>
    <th>Ngày mượn</th>
    <th>Ngày trả</th>
  </tr>
  <%
    List<TheMuonSach> danhSachMuonSach = (List<TheMuonSach>) request.getAttribute("danhSachMuonSach");
    for(TheMuonSach theMuonSach : danhSachMuonSach) {
  %>
  <tr>
    <td><%= theMuonSach.getMaTheMuon() %></td>
    <td><%= theMuonSach.getMaSach() %></td>
    <td><%= theMuonSach.getMaHocSinh() %></td>
    <td><%= theMuonSach.getNgayMuon() %></td>
    <td><%= theMuonSach.getNgayTra() != null ? theMuonSach.getNgayTra() : "Chưa trả" %></td>
  </tr>
  <%
    }
  %>
</table>
</body>
</html>
