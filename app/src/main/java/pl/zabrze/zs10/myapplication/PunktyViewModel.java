package pl.zabrze.zs10.myapplication;

import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private int punkty;

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }
    public void dodajPunkty(int ile){
        punkty+=ile;
    }
}
