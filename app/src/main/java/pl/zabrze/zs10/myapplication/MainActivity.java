package pl.zabrze.zs10.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.zabrze.zs10.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; //nazwa od pliku xml
    private PunktyViewModel punktyViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        punktyViewModel = new ViewModelProvider(this)
                .get(PunktyViewModel.class);
        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(1);
                        binding.textView
                                .setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(2);
                        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       punktyViewModel.dodajPunkty(3);
                        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );

    }
}