package com.transport.university.universitytransportsystem.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StoppageIdExceptionResponse {
    private String stoppageIdentifier;
}