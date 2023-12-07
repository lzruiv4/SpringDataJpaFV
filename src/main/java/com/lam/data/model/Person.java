package com.lam.data.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class Person {
    private final UUID personId;
    private final String name;
    private final String address;
}
