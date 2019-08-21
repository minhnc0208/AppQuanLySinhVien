package com.example.appquanlysinhvien.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appquanlysinhvien.R;
import com.example.appquanlysinhvien.adapter.SinhvienAdapter;
import com.example.appquanlysinhvien.model.Sinhvien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtLop, edtDiaChi;
    Button btnHuy, btnThem;
    RecyclerView recyclerView;
    ArrayList<Sinhvien>sinhviens;
    SinhvienAdapter sinhvienAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sinhviens.add(new Sinhvien("Nguyen Van A","10A1","38 Nguyen Lam"));
        sinhviens.add(new Sinhvien("Nguyen Van A","10A1","38 Nguyen Lam"));
        sinhviens.add(new Sinhvien("Nguyen Van A","10A1","38 Nguyen Lam"));
        sinhviens.add(new Sinhvien("Nguyen Van A","10A1","38 Nguyen Lam"));
        sinhviens.add(new Sinhvien("Nguyen Van A","10A1","38 Nguyen Lam"));
        sinhvienAdapter = new SinhvienAdapter(sinhviens);
        recyclerView.setLayoutManager(new RelativeLayoutManager());
        mapview();
        // Recyclerview :
        // Hiển thị:
        // + Tên sinh viên
        // + Lớp
        // + Địa Chỉ
        // Chức năng:
        // + Button cho phép xóa sinh viên

    }

    private void mapview() {
        edtTen = findViewById(R.id.edittextTen);
        edtLop = findViewById(R.id.edittextLop);
        edtDiaChi = findViewById(R.id.edittextDiachi);
        btnHuy = findViewById(R.id.buttonCancel);
        btnThem = findViewById(R.id.buttonAdd);
        recyclerView = findViewById(R.id.recyclerviewSinhvien);
    }
}
