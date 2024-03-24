package duyhn.appcong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Gắn Layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }

    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính tồnge
    public void XuLyCong(View view) {
        //Tìm, tham chiếu đến điều khiển trên tệp XML, mapping sang java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();         //strA = "2"
        //Lấy dữ liệu về ở điều khiển số b
        String strB = editTextSoB.getText().toString();         //strB = "4"
        //Chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA);  //2
        int so_B = Integer.parseInt(strB);  //4
        //Tính toán theo yêu cầu
        int Tong = so_A + so_B;             //6
        String strTong = String.valueOf(Tong);                  //Chuyển sang dạng chuỗi
        //Hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}