package com.kafkatutorial.restaurant.wrappers;

public record UniversalResponse(int statusCode, String message, Object data) {
}
