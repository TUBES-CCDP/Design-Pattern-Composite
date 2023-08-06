import java.util.List;
import java.util.ArrayList;

class KelompokBangunDatar implements BangunDatar {
    private List<BangunDatar> bangunDatarList = new ArrayList<>();

    public void tambahBangunDatar(BangunDatar bangunDatar) {
        bangunDatarList.add(bangunDatar);
    }

    public void hapusBangunDatar(BangunDatar bangunDatar) {
        bangunDatarList.remove(bangunDatar);
    }

    @Override
    public double hitungLuas() {
        double totalLuas = 0.0;
        for (BangunDatar bangunDatar : bangunDatarList) {
            totalLuas += bangunDatar.hitungLuas();
        }
        return totalLuas;
    }
}