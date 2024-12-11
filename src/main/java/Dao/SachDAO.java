package Dao;

import model.Sach;
import java.util.List;
import java.util.ArrayList;

public class SachDAO {
    public List<Sach> getAllSach() {
        // Thực hiện lấy tất cả các sách từ CSDL hoặc giả lập
        return new ArrayList<>();
    }

    public Sach getSachById(String id) {
        // Thực hiện lấy sách theo mã sách từ CSDL hoặc giả lập
        return new Sach(id, "Tên sách", "Tác giả", "Mô tả", 10);
    }

    public boolean addSach(Sach sach) {
        // Thực hiện thêm sách vào CSDL
        return true;
    }

    public boolean updateSach(Sach sach) {
        // Thực hiện cập nhật sách trong CSDL
        return true;
    }

    public boolean deleteSach(String id) {
        // Thực hiện xóa sách khỏi CSDL
        return true;
    }

    public boolean decreaseSoLuongSach(String maSach) {
        // Giảm số lượng sách
        return true;
    }
}
