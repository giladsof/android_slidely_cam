package com.slidely.slidelycam;

//import android.graphics.Bitmap;
//import android.media.MediaMetadataRetriever;
//import android.media.MediaPlayer;
//import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
//import android.app.AlertDialog;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.ViewGroup.LayoutParams;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.MediaController;
//import android.widget.Toast;
//import android.widget.VideoView;

public class SliceActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slice);
    }
}
//
//    MediaMetadataRetriever mediaMetadataRetriever;
//    MediaController myMediaController;
//    VideoView myVideoView;
//    String viewSource = "";//android.resource://"+getPackageName()+ "/raw/bli.mp4";///storage/sdcard0/DCIM/100MEDIA/VIDEO0009.mp4";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_slice);
//
//        mediaMetadataRetriever = new MediaMetadataRetriever();
//        //mediaMetadataRetriever.setDataSource(viewSource);
//
//        myVideoView = (VideoView) findViewById(R.id.videoview);
//        myVideoView.setVideoURI(Uri.parse(viewSource));
//        myMediaController = new MediaController(this);
//        myVideoView.setMediaController(myMediaController);
//
//        myVideoView.setOnCompletionListener(myVideoViewCompletionListener);
//        myVideoView.setOnPreparedListener(MyVideoViewPreparedListener);
//        myVideoView.setOnErrorListener(myVideoViewErrorListener);
//
//        myVideoView.requestFocus();
//        myVideoView.start();
//
//        Button buttonCapture = (Button)findViewById(R.id.capture);
//        buttonCapture.setOnClickListener(new OnClickListener(){
//
//            @Override
//            public void onClick(View arg0) {
//
//                int currentPosition = myVideoView.getCurrentPosition(); //in millisecond
//                Toast.makeText(SliceActivity.this,
//                        "Current Position: " + currentPosition + " (ms)",
//                        Toast.LENGTH_LONG).show();
//
//                Bitmap bmFrame = mediaMetadataRetriever
//                        .getFrameAtTime(currentPosition * 1000); //unit in microsecond
//
//                if(bmFrame == null){
//                    Toast.makeText(SliceActivity.this,
//                            "bmFrame == null!",
//                            Toast.LENGTH_LONG).show();
//                }else{
//                    AlertDialog.Builder myCaptureDialog =
//                            new AlertDialog.Builder(SliceActivity.this);
//                    ImageView capturedImageView = new ImageView(SliceActivity.this);
//                    capturedImageView.setImageBitmap(bmFrame);
//                    LayoutParams capturedImageViewLayoutParams =
//                            new LayoutParams(LayoutParams.WRAP_CONTENT,
//                                    LayoutParams.WRAP_CONTENT);
//                    capturedImageView.setLayoutParams(capturedImageViewLayoutParams);
//
//                    myCaptureDialog.setView(capturedImageView);
//                    myCaptureDialog.show();
//                }
//
//            }});
//
//    }
//
//    MediaPlayer.OnCompletionListener myVideoViewCompletionListener =
//            new MediaPlayer.OnCompletionListener() {
//
//                @Override
//                public void onCompletion(MediaPlayer arg0) {
//                    Toast.makeText(SliceActivity.this, "End of Video",
//                            Toast.LENGTH_LONG).show();
//                }
//            };
//
//    MediaPlayer.OnPreparedListener MyVideoViewPreparedListener =
//            new MediaPlayer.OnPreparedListener() {
//
//                @Override
//                public void onPrepared(MediaPlayer mp) {
//
//                    long duration = myVideoView.getDuration(); //in millisecond
//                    Toast.makeText(SliceActivity.this,
//                            "Duration: " + duration + " (ms)",
//                            Toast.LENGTH_LONG).show();
//
//                }
//            };
//
//    MediaPlayer.OnErrorListener myVideoViewErrorListener =
//            new MediaPlayer.OnErrorListener() {
//
//                @Override
//                public boolean onError(MediaPlayer mp, int what, int extra) {
//
//                    Toast.makeText(SliceActivity.this,
//                            "Error!!!",
//                            Toast.LENGTH_LONG).show();
//                    return true;
//                }
//            };
//
//}
