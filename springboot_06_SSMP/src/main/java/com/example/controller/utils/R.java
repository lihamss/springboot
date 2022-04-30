package com.example.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.text.StyledEditorKit;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private Boolean flag;
    private Object data;
    private String message;

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag, String message){
        this.flag = flag;
        this.message = message;
    }


    public R(Boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(String message){
        this.flag = false;
        this.message = message;
    }
}
