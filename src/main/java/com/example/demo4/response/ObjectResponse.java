package com.example.demo4.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjectResponse {
    private int code;
    private String message;
    private Object data;
    public static final int STATUS_CODE_SUCCESS = 200;
    public static final int STATUS_CODE_BAD_REQUEST = 409;
    public static final int STATUS_CODE_NOT_FOUND = 404;
    public static final int STATUS_CODE_NOT_ACCEPTABLE = 406 ;
    public static final int STATUS_CODE_UNKNOWN_FAILED = 500;
    public static final int STATUS_CODE_NOT_ALLOW = 406;
    public static final int STATUS_CODE_UNAUTHORIZED = 401;
    public static final int STATUS_CODE_FORBIDDEN = 403;
    public static final int STATUS_CODE_NOT_SUPPORT = 300;
    public static final int STATUS_CODE_TOO_MANY_REQUEST = 309;

    public static final String MESSAGE_SUCCESS = "SUCCESS!";
    public static final String MESSAGE_NULL_ID = "ID MUST NOT BE NULL";
    public static final String MESSAGE_NO_REMAINING_FOR_CREATE_LATESOON_REQUEST = "YOU CANT CREATE MORE THAN 2 LATESOON REQUEST A WEEK";
    public static final String MESSAGE_NO_REMAINING_DAY_FOR_OFF_REQUEST = "YOU CANT OFF MORE THAN 180 DAYS PER YEAR";

    public static final String MESSAGE_UNAUTHORIZED_TO_CREATE_ADMIN = "UNAUTHORIZED TO CREATE ADMIN";
    public static final String MESSAGE_UNAUTHORIZED_TO_CREATE_USER = "UNAUTHORIZED TO CREATE USER";
    public static final String MESSAGE_PARAM_INPUT_NOT_ACCEPTABLE = "PARAM INPUT NOT ACCEPTABLE";
    public static final String MESSAGE_FAIL_TO_PARSE_FROM_STRING_TO_LONG = "FAIL TO PARSE FROM STRING TO LONG";
    public static final String MESSAGE_UNAUTHORIZED = "UNAUTHORIZED TO DO THIS TASK";
    public static final String MESSAGE_USER_NOT_FOUND = "CAN NOT FIND USER WITH ID : ";
    public static final String MESSAGE_REQUEST_NOT_FOUND = "CAN NOT FIND REQUEST WITH ID : ";
    public static final String MESSAGE_USER_NOT_FOUND_WITH_EMAIL = "CAN NOT FIND USER WITH EMAIL : ";
    public static final String MESSAGE_EVENT_DELETE_NOT_ALLOW = "CAN NOT DELETE EVENT";
    public static final String MESSAGE_NEWS_NOT_FOUND = "CAN NOT FIND NEWS WITH ID : ";
    public static final String MESSAGE_COMMENT_NOT_FOUND = "CAN NOT FIND COMMENT WITH ID : ";
    public static final String MESSAGE_SUBCOMMENT_NOT_FOUND = "CAN NOT FIND SUBCOMMENT WITH ID : ";
    public static final String MESSAGE_EVENT_NOT_FOUND = "CAN NOT FIND EVENT WITH ID : ";
    public static final String MESSAGE_OBJECT_NOT_FOUND = "CAN NOT FIND OBJECT WITH ID : ";
    public static final String MESSAGE_UNAUTHORIZED_TO_UPDATE_EVENT = "USER UNAUTHORIZED TO UPDATE EVENT WITH ID : ";
    public static final String MESSAGE_UNAUTHORIZED_TO_DELETE_EVENT = "USER UNAUTHORIZED TO DELETE EVENT WITH ID : ";

    public static final String MESSAGE_BOX_NOT_FOUND = "CAN NOT FIND BOX WITH ID: ";
    public static final String MESSAGE_QUESTION_NOT_FOUND = "CAN NOT FIND QUESTION WITH ID: ";
    public static final String MESSAGE_UNAUTHORIZED_TO_CREATE_QUESTION = "UNAUTHORIZED TO CREATE QUESTION";
    public static final String MESSAGE_UNAUTHORIZED_TO_DELETE_QUESTION = "UNAUTHORIZED TO DELETE QUESTION WITH ID: ";
    public static final String MESSAGE_UNAUTHORIZED_TO_ANSWER_QUESTION = "UNAUTHORIZED TO ANSWER QUESTION WITH ID: ";
    public static final String MESSAGE_UNAUTHORIZED_TO_VIEW_LIST_QUESTION = "UNAUTHORIZED TO VIEW LIST QUESTION BY USER ID: ";
    public static final String MESSAGE_PASSWORD_INCORRECT = "PASSWORD INCORRECT ";
    public static final String MESSAGE_USER_KEY_NULL = "KEY NULL ";
    public static final String MESSAGE_EMAIL_EXISTED = "EMAIL EXIST ";
    public static final String MESSAGE_USERNAME_EXISTED= "USERNAME_INCORRECT ";
    public static final String MESSAGE_USER_ACCOUNT_INACTIVE= "ACCOUNT INACTIVE ";



}
