package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.TokenCreateParams;
import com.stripe.param.TokenRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Token extends ApiResource implements HasId {
    @SerializedName("bank_account")
    BankAccount bankAccount;
    @SerializedName("card")
    Card card;

    /**
     * IP address of the client that generated the token.
     */
    @SerializedName("client_ip")
    String clientIp;

    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @SerializedName("created")
    Long created;

    /**
     * Email of the user, whose token is created during Stripe Checkout. This field is non-standard, and maybe removed in the future.
     */
    @SerializedName("email")
    String email;

    /**
     * Unique identifier for the object.
     */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
     */
    @SerializedName("livemode")
    Boolean livemode;

    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    @SerializedName("object")
    String object;

    /**
     * Type of the token: `account`, `bank_account`, `card`, or `pii`.
     */
    @SerializedName("type")
    String type;

    /**
     * Whether this token has already been used (tokens can be used only once).
     */
    @SerializedName("used")
    Boolean used;

    /**
     * <p>Creates a single-use token that represents a bank account’s details.
     * This token can be used with any API method in place of a bank account dictionary. This token can be used only once, by attaching it to a <a href="#accounts">Custom account</a>.</p>
     */
    public static Token create(
        Map<String, Object> params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a single-use token that represents a bank account’s details.
     * This token can be used with any API method in place of a bank account dictionary. This token can be used only once, by attaching it to a <a href="#accounts">Custom account</a>.</p>
     */
    public static Token create(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/tokens", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Token.class,
            options
        );
    }
    /**
     * <p>Creates a single-use token that represents a bank account’s details.
     * This token can be used with any API method in place of a bank account dictionary. This token can be used only once, by attaching it to a <a href="#accounts">Custom account</a>.</p>
     */
    public static Token create(
        TokenCreateParams params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a single-use token that represents a bank account’s details.
     * This token can be used with any API method in place of a bank account dictionary. This token can be used only once, by attaching it to a <a href="#accounts">Custom account</a>.</p>
     */
    public static Token create(
        TokenCreateParams params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/tokens", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Token.class,
            options
        );
    }
    /**
     * <p>Retrieves the token with the given ID.</p>
     */
    public static Token retrieve(String token) throws StripeException {
        return retrieve(
            token,
            (Map<String, Object>) null,
            (RequestOptions) null
        );
    }
    /**
     * <p>Retrieves the token with the given ID.</p>
     */
    public static Token retrieve(
        String token,
        RequestOptions options) throws StripeException {

        return retrieve(token, (Map<String, Object>) null, options);
    }
    /**
     * <p>Retrieves the token with the given ID.</p>
     */
    public static Token retrieve(
        String token,
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/tokens/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(token)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Token.class,
            options
        );
    }
    /**
     * <p>Retrieves the token with the given ID.</p>
     */
    public static Token retrieve(
        String token,
        TokenRetrieveParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/tokens/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(token)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Token.class,
            options
        );
    }
}