package duyhn.vd2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //khai báo các đối tượng gắn với điều khiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

     void TimDieuKhien() {
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        EditText editTextKetQua = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    //xử lý cộng
    public void XuLyCong(View v) {
        //Code xử lý cộng ở đây
        //b1: lấy dữ liệu 2 số
        //b1.1: tìm EditText số 1 và số 2

        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3: chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2: tính toán
        float Tong = soA + soB;
        //b3: hiện kết quả
        //b3.1.

        //b3.2: chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3: gắn kết quả lên dk
        editTextKetQua.setText(chuoiKQ);
    }

    //xử lý trừ
    public void XuLyTru(View v) {
        //Code xử lý trừ ở đây
        //b1: lấy dữ liệu 2 số
        //b1.1: tìm EditText số 1 và số 2

        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b.3: chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2: tính toán
        float Hieu = soA - soB;
        //b3: hiện kết quả
        //b3.1.

        //b3.2: chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Hieu);
        //b3.3: gắn kết quả lên dk
        editTextKetQua.setText(chuoiKQ);

    }

    //xử lý nhân
    public void XuLyNhan(View v) {
        //Code xử lý nhân ở đây
        //b1: lấy dữ liệu 2 số
        //b1.1: tìm EditText số 1 và số 2

        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b.3: chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2: tính toán
        float Tich = soA * soB;
        //b3: hiện kết quả
        //b3.1.

        //b3.2: chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tich);
        //b3.3: gắn kết quả lên dk
        editTextKetQua.setText(chuoiKQ);
    }

    //xử lý chia
    public void XuLyChia(View v) {
        //Code xử lý chia ở đây
        //b1: lấy dữ liệu 2 số
        //b1.1: tìm EditText số 1 và số 2

        //b1.2: lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b.3: chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2: tính toán
        float Thuong = soA / soB;
        //b3: hiện kết quả
        //b3.1.

        //b3.2: chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Thuong);
        //b3.3: gắn kết quả lên dk
        editTextKetQua.setText(chuoiKQ);
    }
}