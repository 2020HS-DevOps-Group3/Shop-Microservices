package com.devops.common.utils;

public interface Constants {

    final class ResponseMessages {
        public static final String RESOURCE_RENDERED_SUCCESSFULLY = "resource rendered successfully.";
        public static final String CONTINUE_MESSAGE = "continue for addition resource.";
        public static final String SWITCHING_PROTOCOLS_MESSAGE = "switching protocols for client.";
        public static final String PROCESSING_MESSAGE = "processing request.";
        public static final String CHECKPOINT_MESSAGE = " checkpoint.";
        public static final String OK_MESSAGE = RESOURCE_RENDERED_SUCCESSFULLY;
        public static final String CREATED_MESSAGE = "resource created successfully.";
        public static final String ACCEPTED_MESSAGE = "request accepted.";
        public static final String NON_AUTHORITATIVE_INFORMATION_MESSAGE = " nonAuthoritativeInformation.";
        public static final String NO_CONTENT_MESSAGE = "no resource required.";
        public static final String RESET_CONTENT_MESSAGE = " resetContent.";
        public static final String PARTIAL_CONTENT_MESSAGE = " partialContent.";
        public static final String MULTI_STATUS_MESSAGE = " multiStatus.";
        public static final String ALREADY_REPORTED_MESSAGE = " alreadyReported.";
        public static final String IM_USED_MESSAGE = " imUsed.";
        public static final String MULTIPLE_CHOICES_MESSAGE = " multipleChoices.";
        public static final String MOVED_PERMANENTLY_MESSAGE = " movedPermanently.";
        public static final String FOUND_MESSAGE = " found.";
        public static final String SEE_OTHER_MESSAGE = " seeOther.";
        public static final String NOT_MODIFIED_MESSAGE = " notModified.";
        public static final String TEMPORARY_REDIRECT_MESSAGE = " temporaryRedirect.";
        public static final String PERMANENT_REDIRECT_MESSAGE = " permanentRedirect.";
        public static final String BAD_REQUEST_MESSAGE = "Bad request.";
        public static final String UNAUTHORIZED_MESSAGE = "Unauthorized request user not logged in.";
        public static final String PAYMENT_REQUIRED_MESSAGE = " paymentRequired.";
        public static final String FORBIDDEN_MESSAGE = "resource forbidden.";
        public static final String NOT_FOUND_MESSAGE = "resource notFound.";
        public static final String METHOD_NOT_ALLOWED_MESSAGE = "method not allowed for resource.";
        public static final String NOT_ACCEPTABLE_MESSAGE = " notAcceptable.";
        public static final String PROXY_AUTHENTICATION_REQUIRED_MESSAGE = " proxyAuthenticationRequired.";
        public static final String REQUEST_TIMEOUT_MESSAGE = " requestTimeout.";
        public static final String CONFLICT_MESSAGE = " conflict.";
        public static final String GONE_MESSAGE = " gone.";
        public static final String LENGTH_REQUIRED_MESSAGE = " lengthRequired.";
        public static final String PRECONDITION_FAILED_MESSAGE = " preconditionFailed.";
        public static final String PAYLOAD_TOO_LARGE_MESSAGE = " payloadTooLarge.";
        public static final String URI_TOO_LONG_MESSAGE = " uriTooLong.";
        public static final String UNSUPPORTED_MEDIA_TYPE_MESSAGE = " unsupportedMediaType.";
        public static final String REQUESTED_RANGE_NOT_SATISFIABLE_MESSAGE = " requestedRangeNotSatisfiable.";
        public static final String EXPECTATION_FAILED_MESSAGE = " expectationFailed.";
        public static final String UNPROCESSABLE_ENTITY_MESSAGE = " unprocessableEntity.";
        public static final String LOCKED_MESSAGE = " locked.";
        public static final String FAILED_DEPENDENCY_MESSAGE = " failedDependency.";
        public static final String UPGRADE_REQUIRED_MESSAGE = " upgradeRequired.";
        public static final String PRECONDITION_REQUIRED_MESSAGE = " preconditionRequired.";
        public static final String TOO_MANY_REQUESTS_MESSAGE = "too many requests for resource.";
        public static final String REQUEST_HEADER_FIELDS_TOO_LARGE_MESSAGE = " requestHeaderFieldsTooLarge.";
        public static final String UNAVAILABLE_FOR_LEGAL_REASONS_MESSAGE = " unavailableForLegalReasons.";
        public static final String INTERNAL_SERVER_ERROR_MESSAGE = " internalServerError.";
        public static final String NOT_IMPLEMENTED_MESSAGE = " notImplemented.";
        public static final String BAD_GATEWAY_MESSAGE = " badGateway.";
        public static final String SERVICE_UNAVAILABLE_MESSAGE = " serviceUnavailable.";
        public static final String GATEWAY_TIMEOUT_MESSAGE = " gatewayTimeout.";
        public static final String HTTP_VERSION_NOT_SUPPORTED_MESSAGE = " httpVersionNotSupported.";
        public static final String VARIANT_ALSO_NEGOTIATES_MESSAGE = " variantAlsoNegotiates.";
        public static final String INSUFFICIENT_STORAGE_MESSAGE = " insufficientStorage.";
        public static final String LOOP_DETECTED_MESSAGE = " loopDetected.";
        public static final String BANDWIDTH_LIMIT_EXCEEDED_MESSAGE = " bandwidthLimitExceeded.";
        public static final String NOT_EXTENDED_MESSAGE = " notExtended.";
        public static final String NETWORK_AUTHENTICATION_REQUIRED_MESSAGE = " networkAuthenticationRequired.";

        private ResponseMessages() {
        }
    }

    final class ErrorMessages {
        public static final String USER_NOT_FOUND = "User not found";
        public static final String USER_ALREADY_EXISTS = "User already exists";
        public static final String PAYMENT_ALREADY_MADE = "Payment details already exists";
        public static final String ORDER_NOT_FOUND = "Order not found";
        public static final String PRODUCT_NOT_FOUND = "Product not found";

        private ErrorMessages() {
        }
    }

    final class EntityNames {
        public static final String USER = "User";

        private EntityNames() {
        }
    }

    final class StringConstants {
        public static final String USER = "User";
        public static final String BUG = "Bug";

        private StringConstants() {
        }
    }
}
