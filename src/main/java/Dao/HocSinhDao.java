package Dao;

import model.HocSinh;
import java.util.List;
import java.util.ArrayList;

public class HocSinhDao {

    public List<HocSinh> getAllHocSinh() {
        // Lấy danh sách tất cả học sinh từ cơ sở dữ liệu (hoặc mô phỏng)
        return new ArrayList<>();
    }

    public HocSinh getHocSinhById(String id) {
        // Lấy thông tin học sinh từ cơ sở dữ liệu theo mã học sinh
        return new HocSinh(id, "Nguyễn Văn A", "Lớp 10");
    }

    public boolean addHocSinh(HocSinh hocSinh) {
        // Thêm học sinh vào cơ sở dữ liệu
        return true;
    }

    public boolean updateHocSinh(HocSinh hocSinh) {
        // Cập nhật thông tin học sinh trong cơ sở dữ liệu
        return true;
    }

    public boolean deleteHocSinh(String id) {
        // Xóa học sinh khỏi cơ sở dữ liệu
        return true;
    }
}
