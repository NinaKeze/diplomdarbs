package com.example.fastandroidchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.stfalcon.chatkit.messages.MessageInput;

import com.example.fastandroidchat.utils.Constants;

public class ChatActivity extends AppCompatActivity {
public static void start(Context context, String groupId) {
    Intent starter = new Intent(context, ChatActivity.class);
    starter.putExtra (Constants.GROUP_ID, groupId);
    context.startActivity(starter);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        initViews();
    }

    private void initViews() {
    MessageInput inputView = findViewById(R.id.input);
        inputView.setInputListener(new MessageInput.InputListener() {
            @Override
            public boolean onSubmit(CharSequence input) {
              sendMessage(input.toString());
                return true;
            }
        });
    }
    private void sendMessage(String message){

    }
}