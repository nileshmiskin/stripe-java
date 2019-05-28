package com.stripe.model.checkout;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.PaymentIntent;
import com.stripe.model.Plan;
import com.stripe.model.Sku;
import com.stripe.model.StripeObject;
import com.stripe.model.Subscription;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.param.checkout.SessionRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Session extends ApiResource implements HasId {

    /**
     * The value (`auto` or `required`) for whether Checkout collected the customer's billing address.
     */
    @SerializedName("billing_address_collection")
    String billingAddressCollection;

    /**
     * The URL the customer will be directed to if they decide to cancel payment and return to your website.
     */
    @SerializedName("cancel_url")
    String cancelUrl;

    /**
     * A unique string to reference the Checkout Session. This can be a
customer ID, a cart ID, or similar, and can be used to reconcile the
session with your internal systems.
     */
    @SerializedName("client_reference_id")
    String clientReferenceId;

    /**
     * The ID of the customer for this session. A new customer will be created unless an existing customer was provided in when the session was created.
     */
    @SerializedName("customer")
    ExpandableField<Customer> customer;

    /**
     * If provided, this value will be used when the Customer object is created.
If not provided, customers will be asked to enter their email address.
Use this parameter to prefill customer data if you already have an email
on file. To access information about the customer once a session is
complete, use the `customer` field.
     */
    @SerializedName("customer_email")
    String customerEmail;

    /**
     * The line items, plans, or SKUs purchased by the customer.
     */
    @SerializedName("display_items")
    List<Session.DisplayItem> displayItems;

    /**
     * Unique identifier for the object. Used to pass to `redirectToCheckout` in Stripe.js.
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
     * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's locale is used.
     */
    @SerializedName("locale")
    String locale;

    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    @SerializedName("object")
    String object;

    /**
     * The ID of the PaymentIntent created if SKUs or line items were provided.
     */
    @SerializedName("payment_intent")
    ExpandableField<PaymentIntent> paymentIntent;

    /**
     * A list of the types of payment methods (e.g. card) this Checkout Session is allowed to accept.
     */
    @SerializedName("payment_method_types")
    List<String> paymentMethodTypes;

    /**
     * The ID of the subscription created if one or more plans were provided.
     */
    @SerializedName("subscription")
    ExpandableField<Subscription> subscription;

    /**
     * The URL the customer will be directed to after the payment or subscription creation is successful.
     */
    @SerializedName("success_url")
    String successUrl;
    /**
     * Get id of expandable `customer` object.
     */
    public String getCustomer() {
        return (this.customer != null) ? this.customer.getId() : null;
    }
    public void setCustomer(String id) {
        this.customer = ApiResource.setExpandableFieldId(id, this.customer);
    }
    /**
     * Get expanded `customer`.
     */
    public Customer getCustomerObject() {
        return (this.customer != null) ? this.customer.getExpanded() : null;
    }
    public void setCustomerObject(Customer expandableObject) {
        this.customer =
            new ExpandableField<Customer>(
                expandableObject.getId(),
                expandableObject
            );
    }
    /**
     * Get id of expandable `paymentIntent` object.
     */
    public String getPaymentIntent() {
        return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
    }
    public void setPaymentIntent(String id) {
        this.paymentIntent =
            ApiResource.setExpandableFieldId(id, this.paymentIntent);
    }
    /**
     * Get expanded `paymentIntent`.
     */
    public PaymentIntent getPaymentIntentObject() {
        return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
    }
    public void setPaymentIntentObject(PaymentIntent expandableObject) {
        this.paymentIntent =
            new ExpandableField<PaymentIntent>(
                expandableObject.getId(),
                expandableObject
            );
    }
    /**
     * Get id of expandable `subscription` object.
     */
    public String getSubscription() {
        return (this.subscription != null) ? this.subscription.getId() : null;
    }
    public void setSubscription(String id) {
        this.subscription =
            ApiResource.setExpandableFieldId(id, this.subscription);
    }
    /**
     * Get expanded `subscription`.
     */
    public Subscription getSubscriptionObject() {
        return (this.subscription != null) ? this.subscription.getExpanded() : null;
    }
    public void setSubscriptionObject(Subscription expandableObject) {
        this.subscription =
            new ExpandableField<Subscription>(
                expandableObject.getId(),
                expandableObject
            );
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayItem extends StripeObject {

        /**
         * Amount for the display item.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
         */
        @SerializedName("currency")
        String currency;
        @SerializedName("custom")
        Session.DisplayItem.Custom custom;
        @SerializedName("plan")
        Plan plan;

        /**
         * Quantity of the display item being purchased.
         */
        @SerializedName("quantity")
        Long quantity;
        @SerializedName("sku")
        Sku sku;

        /**
         * The type of display item. One of `custom`, `plan` or `sku`
         */
        @SerializedName("type")
        String type;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Custom extends StripeObject {

            /**
             * The description of the line item.
             */
            @SerializedName("description")
            String description;

            /**
             * The images of the line item.
             */
            @SerializedName("images")
            List<String> images;

            /**
             * The name of the line item.
             */
            @SerializedName("name")
            String name;

        }
    }
    /**
     * <p>Creates a Session object.</p>
     */
    public static Session create(
        Map<String, Object> params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a Session object.</p>
     */
    public static Session create(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format("%s/v1/checkout/sessions", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Session.class,
            options
        );
    }
    /**
     * <p>Creates a Session object.</p>
     */
    public static Session create(
        SessionCreateParams params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a Session object.</p>
     */
    public static Session create(
        SessionCreateParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format("%s/v1/checkout/sessions", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Session.class,
            options
        );
    }
    /**
     * <p>Retrieves a Session object.</p>
     */
    public static Session retrieve(String session) throws StripeException {
        return retrieve(
            session,
            (Map<String, Object>) null,
            (RequestOptions) null
        );
    }
    /**
     * <p>Retrieves a Session object.</p>
     */
    public static Session retrieve(
        String session,
        RequestOptions options) throws StripeException {

        return retrieve(session, (Map<String, Object>) null, options);
    }
    /**
     * <p>Retrieves a Session object.</p>
     */
    public static Session retrieve(
        String session,
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/checkout/sessions/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(session)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Session.class,
            options
        );
    }
    /**
     * <p>Retrieves a Session object.</p>
     */
    public static Session retrieve(
        String session,
        SessionRetrieveParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/checkout/sessions/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(session)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Session.class,
            options
        );
    }
}