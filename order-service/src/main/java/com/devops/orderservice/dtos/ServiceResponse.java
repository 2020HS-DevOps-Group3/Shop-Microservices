package com.devops.orderservice.dtos;

import com.devops.orderservice.utils.Constants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
public class ServiceResponse<T> {

    private final T results;
    private final String message;

    public ServiceResponse(T results, String message) {
        this.results = results;
        this.message = message;
    }

    /**
     * @param results
     * @param message
     * @return <T> ResponseEntity<ServiceResponse<T>>
     */
    private static <T> ServiceResponse<T> generateResponseBuilder(T results, String message) {
        return new ServiceResponse<>(results, message);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> continueResponse() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CONTINUE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> continueResponse(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> continueResponse(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CONTINUE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> continueResponse(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    continueResponse(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CONTINUE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> switchingProtocols() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.SWITCHING_PROTOCOLS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> switchingProtocols(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> switchingProtocols(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.SWITCHING_PROTOCOLS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> switchingProtocols(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    switchingProtocols(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.SWITCHING_PROTOCOLS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> processing() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PROCESSING_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> processing(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> processing(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PROCESSING_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> processing(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> processing(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PROCESSING);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> checkpoint() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CHECKPOINT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> checkpoint(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> checkpoint(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CHECKPOINT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> checkpoint(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> checkpoint(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CHECKPOINT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> ok() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.OK_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> ok(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> ok(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.OK_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> ok(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> ok(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> created() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CREATED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> created(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> created(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CREATED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> created(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> created(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> accepted() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.ACCEPTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> accepted(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> accepted(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.ACCEPTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> accepted(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> accepted(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.ACCEPTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> nonAuthoritativeInformation() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NON_AUTHORITATIVE_INFORMATION_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> nonAuthoritativeInformation(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> nonAuthoritativeInformation(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NON_AUTHORITATIVE_INFORMATION_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> nonAuthoritativeInformation(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    nonAuthoritativeInformation(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> noContent() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NO_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> noContent(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> noContent(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NO_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> noContent(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> noContent(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NO_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> resetContent() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.RESET_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> resetContent(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> resetContent(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.RESET_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> resetContent(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> resetContent(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.RESET_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> partialContent() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PARTIAL_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> partialContent(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> partialContent(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PARTIAL_CONTENT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> partialContent(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> partialContent(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PARTIAL_CONTENT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multiStatus() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.MULTI_STATUS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multiStatus(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multiStatus(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.MULTI_STATUS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multiStatus(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multiStatus(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.MULTI_STATUS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> alreadyReported() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.ALREADY_REPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> alreadyReported(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> alreadyReported(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.ALREADY_REPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> alreadyReported(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    alreadyReported(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.ALREADY_REPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> imUsed() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.IM_USED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> imUsed(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> imUsed(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.IM_USED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> imUsed(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> imUsed(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.IM_USED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multipleChoices() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.MULTIPLE_CHOICES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multipleChoices(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multipleChoices(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.MULTIPLE_CHOICES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> multipleChoices(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    multipleChoices(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.MULTIPLE_CHOICES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> movedPermanently() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.MOVED_PERMANENTLY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> movedPermanently(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> movedPermanently(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.MOVED_PERMANENTLY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> movedPermanently(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    movedPermanently(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.MOVED_PERMANENTLY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> found() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> found(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> found(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> found(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> found(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> seeOther() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.SEE_OTHER_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> seeOther(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> seeOther(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.SEE_OTHER_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> seeOther(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> seeOther(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.SEE_OTHER);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notModified() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_MODIFIED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notModified(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notModified(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_MODIFIED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notModified(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notModified(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_MODIFIED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> temporaryRedirect() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.TEMPORARY_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> temporaryRedirect(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> temporaryRedirect(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.TEMPORARY_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> temporaryRedirect(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    temporaryRedirect(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.TEMPORARY_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> permanentRedirect() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PERMANENT_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> permanentRedirect(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> permanentRedirect(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PERMANENT_REDIRECT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> permanentRedirect(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    permanentRedirect(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PERMANENT_REDIRECT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badRequest() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badRequest(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badRequest(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.BAD_REQUEST_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badRequest(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badRequest(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.BAD_REQUEST);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unauthorized() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNAUTHORIZED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unauthorized(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unauthorized(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNAUTHORIZED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unauthorized(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unauthorized(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNAUTHORIZED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> paymentRequired() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PAYMENT_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> paymentRequired(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> paymentRequired(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PAYMENT_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> paymentRequired(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    paymentRequired(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PAYMENT_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> forbidden() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.FORBIDDEN_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> forbidden(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> forbidden(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.FORBIDDEN_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> forbidden(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> forbidden(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.FORBIDDEN);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notFound() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notFound(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notFound(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_FOUND_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notFound(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notFound(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> methodNotAllowed() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.METHOD_NOT_ALLOWED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> methodNotAllowed(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> methodNotAllowed(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.METHOD_NOT_ALLOWED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> methodNotAllowed(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    methodNotAllowed(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.METHOD_NOT_ALLOWED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notAcceptable() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_ACCEPTABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notAcceptable(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notAcceptable(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_ACCEPTABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notAcceptable(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notAcceptable(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_ACCEPTABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> proxyAuthenticationRequired() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PROXY_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> proxyAuthenticationRequired(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> proxyAuthenticationRequired(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PROXY_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> proxyAuthenticationRequired(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    proxyAuthenticationRequired(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestTimeout() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUEST_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestTimeout(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestTimeout(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUEST_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestTimeout(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestTimeout(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.REQUEST_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> conflict() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.CONFLICT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> conflict(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> conflict(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.CONFLICT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> conflict(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> conflict(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.CONFLICT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gone() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.GONE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gone(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gone(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.GONE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gone(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gone(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.GONE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> lengthRequired() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.LENGTH_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> lengthRequired(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> lengthRequired(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.LENGTH_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> lengthRequired(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> lengthRequired(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.LENGTH_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionFailed() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PRECONDITION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionFailed(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionFailed(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PRECONDITION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionFailed(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    preconditionFailed(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PRECONDITION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> payloadTooLarge() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PAYLOAD_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> payloadTooLarge(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> payloadTooLarge(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PAYLOAD_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> payloadTooLarge(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    payloadTooLarge(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> uriTooLong() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.URI_TOO_LONG_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> uriTooLong(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> uriTooLong(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.URI_TOO_LONG_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> uriTooLong(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> uriTooLong(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.URI_TOO_LONG);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unsupportedMediaType() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNSUPPORTED_MEDIA_TYPE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unsupportedMediaType(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unsupportedMediaType(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNSUPPORTED_MEDIA_TYPE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unsupportedMediaType(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    unsupportedMediaType(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestedRangeNotSatisfiable() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestedRangeNotSatisfiable(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestedRangeNotSatisfiable(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestedRangeNotSatisfiable(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    requestedRangeNotSatisfiable(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> expectationFailed() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.EXPECTATION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> expectationFailed(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> expectationFailed(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.EXPECTATION_FAILED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> expectationFailed(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    expectationFailed(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.EXPECTATION_FAILED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> iAmATeapot(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.I_AM_A_TEAPOT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unprocessableEntity() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNPROCESSABLE_ENTITY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unprocessableEntity(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unprocessableEntity(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNPROCESSABLE_ENTITY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unprocessableEntity(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    unprocessableEntity(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> locked() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.LOCKED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> locked(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> locked(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.LOCKED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> locked(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> locked(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.LOCKED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> failedDependency() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.FAILED_DEPENDENCY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> failedDependency(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> failedDependency(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.FAILED_DEPENDENCY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> failedDependency(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    failedDependency(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.FAILED_DEPENDENCY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> upgradeRequired() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UPGRADE_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> upgradeRequired(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> upgradeRequired(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UPGRADE_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> upgradeRequired(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    upgradeRequired(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UPGRADE_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionRequired() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.PRECONDITION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionRequired(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionRequired(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.PRECONDITION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> preconditionRequired(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    preconditionRequired(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.PRECONDITION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> tooManyRequests() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.TOO_MANY_REQUESTS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> tooManyRequests(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> tooManyRequests(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.TOO_MANY_REQUESTS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> tooManyRequests(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    tooManyRequests(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.TOO_MANY_REQUESTS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestHeaderFieldsTooLarge() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestHeaderFieldsTooLarge(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestHeaderFieldsTooLarge(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> requestHeaderFieldsTooLarge(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    requestHeaderFieldsTooLarge(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unavailableForLegalReasons() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unavailableForLegalReasons(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unavailableForLegalReasons(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> unavailableForLegalReasons(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    unavailableForLegalReasons(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> internalServerError() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.INTERNAL_SERVER_ERROR_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> internalServerError(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> internalServerError(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.INTERNAL_SERVER_ERROR_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> internalServerError(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    internalServerError(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notImplemented() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_IMPLEMENTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notImplemented(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notImplemented(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_IMPLEMENTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notImplemented(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notImplemented(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_IMPLEMENTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badGateway() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.BAD_GATEWAY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badGateway(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badGateway(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.BAD_GATEWAY_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badGateway(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> badGateway(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.BAD_GATEWAY);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> serviceUnavailable() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.SERVICE_UNAVAILABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> serviceUnavailable(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> serviceUnavailable(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.SERVICE_UNAVAILABLE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> serviceUnavailable(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    serviceUnavailable(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.SERVICE_UNAVAILABLE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gatewayTimeout() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.GATEWAY_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gatewayTimeout(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gatewayTimeout(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.GATEWAY_TIMEOUT_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gatewayTimeout(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> gatewayTimeout(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.GATEWAY_TIMEOUT);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> httpVersionNotSupported() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.HTTP_VERSION_NOT_SUPPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> httpVersionNotSupported(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> httpVersionNotSupported(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.HTTP_VERSION_NOT_SUPPORTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> httpVersionNotSupported(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    httpVersionNotSupported(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> variantAlsoNegotiates() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.VARIANT_ALSO_NEGOTIATES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> variantAlsoNegotiates(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> variantAlsoNegotiates(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.VARIANT_ALSO_NEGOTIATES_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> variantAlsoNegotiates(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    variantAlsoNegotiates(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> insufficientStorage() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.INSUFFICIENT_STORAGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> insufficientStorage(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> insufficientStorage(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.INSUFFICIENT_STORAGE_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> insufficientStorage(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    insufficientStorage(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.INSUFFICIENT_STORAGE);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> loopDetected() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.LOOP_DETECTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> loopDetected(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> loopDetected(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.LOOP_DETECTED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> loopDetected(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> loopDetected(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.LOOP_DETECTED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> bandwidthLimitExceeded() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.BANDWIDTH_LIMIT_EXCEEDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> bandwidthLimitExceeded(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> bandwidthLimitExceeded(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.BANDWIDTH_LIMIT_EXCEEDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> bandwidthLimitExceeded(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    bandwidthLimitExceeded(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notExtended() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NOT_EXTENDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notExtended(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notExtended(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NOT_EXTENDED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notExtended(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> notExtended(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NOT_EXTENDED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> networkAuthenticationRequired() {
        ServiceResponse<T> response =
                generateResponseBuilder(null, Constants.ResponseMessages.NETWORK_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> networkAuthenticationRequired(String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(null, message);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> networkAuthenticationRequired(T results) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, Constants.ResponseMessages.NETWORK_AUTHENTICATION_REQUIRED_MESSAGE);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>> networkAuthenticationRequired(T results, String message) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public static <T> ResponseEntity<ServiceResponse<T>>
    networkAuthenticationRequired(T results, String message, HttpHeaders headers) {
        ServiceResponse<T> response =
                generateResponseBuilder(results, message);
        return new ResponseEntity<>(response, headers, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    public String getMessage() {
        return message;
    }

    public T getResults() {
        return results;
    }
}
