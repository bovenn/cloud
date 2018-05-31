
package com.bovenn.cloud.core.config.validate;

public class FieldErrorDTO {
 
    private String field;
 
    private String message;
 
    public FieldErrorDTO(String field, String message) {
        this.field = field;
        this.message = message;
    }
 
    //Getters are omitted.
}