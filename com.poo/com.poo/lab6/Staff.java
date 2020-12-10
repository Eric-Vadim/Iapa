package com.oop.lab6;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Staff extends Person{
    private LocalDateTime joined;
    private ArrayList<String>   education,
                                certification,
                                languages;
}