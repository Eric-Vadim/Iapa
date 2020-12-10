package com.oop.lab6;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Patient extends Person {
    private String  id,
                    sickness;
    private LocalDateTime accepted;
    private int age;

    private ArrayList<String>   prescriptions,
                                allergies,
                                specialReqs;
}