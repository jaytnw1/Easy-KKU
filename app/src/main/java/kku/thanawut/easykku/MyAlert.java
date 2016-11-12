package kku.thanawut.easykku;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by CSITGIS on 12/11/2559.
 */

public class MyAlert {
    ///Explicit
    private Context context;
    private int anInt;
    private String titlestring , messageString;

    public MyAlert(Context context, int anInt, String titlestring, String messageString) {
        this.context = context;
        this.anInt = anInt;
        this.titlestring = titlestring;
        this.messageString = messageString;
    }
    public  void myDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anInt);
        builder.setTitle(titlestring);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }



} // Main Class

