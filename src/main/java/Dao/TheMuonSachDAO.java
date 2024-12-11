package Dao;

import model.TheMuonSach;
import java.util.List;
import java.util.ArrayList;

public class TheMuonSachDAO {
    public List<TheMuonSach> getAllSachMuon() {
        // Lấy tất cả thẻ mượn sách từ CSDL
        return new ArrayList<>();
    }

    public TheMuonSach getSachMuonById(String id) {
        // Lấy thẻ mượn sách theo ID từ CSDL
        return new TheMuonSach(id, "MS123", "HS123", true, "2024-12-01", null);
    }

    public boolean addTheMuonSach(TheMuonSach theMuonSach) {
        // Thêm thẻ mượn sách vào CSDL
        return true;
    }

    public boolean updateTheMuonSach(TheMuonSach theMuonSach) {
        // Cập nhật thẻ mượn sách trong CSDL
        return true;
    }

    public boolean deleteTheMuonSach(String id) {
        // Xóa thẻ mượn sách khỏi CSDL
        return true;
    }
}
