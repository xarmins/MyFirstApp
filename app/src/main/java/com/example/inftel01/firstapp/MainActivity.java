package com.example.inftel01.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static final int REQUEST_CODE = 10;
    private static final String TAG = "hola";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */



    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, activity_main2.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, REQUEST_CODE);


//        String uri = "tel:+34652257915";
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse(uri));
//        startActivity(intent);

        /*String asunto = "Saludo";
        String texto = "Qué pasa juan";
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"xarmins@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,asunto);
        emailIntent.putExtra(Intent.EXTRA_TEXT,texto);
        startActivity(Intent.createChooser(emailIntent,"Envia tu email a:"));*/
        // Declare

       /* Uri uri = Uri.parse("content://contacts");
        Intent intent = new Intent(Intent.ACTION_PICK, uri);
        intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        startActivityForResult(intent, REQUEST_CODE);*/
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        /*if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Uri uri = intent.getData();
                String[] projection = { ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME };

                Cursor cursor = getContentResolver().query(uri, projection,
                        null, null, null);
                cursor.moveToFirst();

                int numberColumnIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                String number = cursor.getString(numberColumnIndex);

                int nameColumnIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);
                String name = cursor.getString(nameColumnIndex);

                Log.d(TAG, "ZZZ number : " + number +" , name : "+name);

                Intent intent1 = new Intent(this, DisplayMessageActivity.class);
                String message = cursor.getString(nameColumnIndex)+" "+cursor.getString(numberColumnIndex);
                intent1.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent1);

            }
        }*/

        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                if (data.hasExtra("returnKey1")) {
                    Toast.makeText(this, data.getExtras().getString("returnKey1"), Toast.LENGTH_SHORT).show();
                }
            }
        }
    };




}
