package id.sch.smktelkom_mlg.tugas01.xirpl431.tugas001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cbReg, cbPK;
    TextView tvTP, tvJP, tvNama, tvTTL, tvAlamat, tvKota, tvJK, tvJur, tvHasil;
    EditText etTP, etNama, etTTL, etAlamat, etKota;
    RadioButton rbPria, rbWanita;
    Spinner spJur;
    Button bOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbReg = (CheckBox) findViewById(R.id.checkBoxReg);
        cbPK = (CheckBox) findViewById(R.id.checkBoxPK);

        tvTP = (TextView) findViewById(R.id.textViewTP);
        tvJP = (TextView) findViewById(R.id.textViewJP);
        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvTTL = (TextView) findViewById(R.id.textViewTTL);
        tvAlamat = (TextView) findViewById(R.id.textViewAlamat);
        tvKota = (TextView) findViewById(R.id.textViewKota);
        tvJK = (TextView) findViewById(R.id.textViewJK);
        tvJur = (TextView) findViewById(R.id.textViewJur);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        etTP = (EditText) findViewById(R.id.editTextTP);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etTTL = (EditText) findViewById(R.id.editTextTTL);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        etKota = (EditText) findViewById(R.id.editTextKota);

        rbPria = (RadioButton) findViewById(R.id.radioButtonPria);
        rbWanita = (RadioButton) findViewById(R.id.radioButtonWanita);

        spJur = (Spinner) findViewById(R.id.spinnerJur);
        bOK = (Button) findViewById(R.id.buttonOK);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doClick() {
        String tanggal = etTP.getText().toString();
        tvTP.setText("Tanggal Pedaftaran : " + tanggal + "\n");
        if (tanggal.isEmpty()) {
            etTP.setError("Tanggal Pendaftaran Belum Diisi");
        }

        String nama = etNama.getText().toString();
        tvNama.setText("Nama Lengkap Pendaftar : " + nama + "\n");
        if (nama.isEmpty()) {
            etNama.setError("Nama Pendaftar Belum Diisi");
        }

        String ttl = etTTL.getText().toString();
        tvTTL.setText("Tempat Tanggal Lahir : " + ttl + "\n");
        if (ttl.isEmpty()) {
            etTTL.setError("TTL Pendaftar Belum Diisi");
        }

        String alamat = etAlamat.getText().toString();
        tvAlamat.setText("Alamat : " + alamat + "\n");
        if (alamat.isEmpty()) {
            etAlamat.setError("Alamat Belum Diisi");
        }

        String kota = etKota.getText().toString();
        tvKota.setText("Kota : " + kota + "\n");
        if (kota.isEmpty()) {
            etKota.setError("Kota Belum Diisi");
        }
    }
}
