package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.CustomerListParams;
import com.stripe.param.CustomerRetrieveParams;
import com.stripe.param.CustomerUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Customer
    extends ApiResource
    implements HasId, MetadataStore<Customer> {

    /**
     * Current balance, if any, being stored on the customer's account. If negative, the customer has credit to apply to the next invoice. If positive, the customer has an amount owed that will be added to the next invoice. The balance does not refer to any unpaid invoices; it solely takes into account amounts that have yet to be successfully applied to any invoice. This balance is only taken into account as invoices are finalized. Note that the balance does not include unpaid invoices.
     */
    @SerializedName("account_balance")
    Long accountBalance;

    /**
     * The customer's address.
     */
    @SerializedName("address")
    Address address;

    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @SerializedName("created")
    Long created;

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) the customer can be charged in for recurring billing purposes.
     */
    @SerializedName("currency")
    String currency;

    /**
     * ID of the default payment source for the customer.
     */
    @SerializedName("default_source")
    ExpandableField<PaymentSource> defaultSource;

    /**
     * Always true for a deleted object.
     */
    @SerializedName("deleted")
    Boolean deleted;

    /**
     * When the customer's latest invoice is billed by charging automatically, delinquent is true if the invoice's latest charge is failed. When the customer's latest invoice is billed by sending an invoice, delinquent is true if the invoice is not paid by its due date.
     */
    @SerializedName("delinquent")
    Boolean delinquent;

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    @SerializedName("description")
    String description;

    /**
     * Describes the current discount active on the customer, if there is one.
     */
    @SerializedName("discount")
    Discount discount;

    /**
     * The customer's email address.
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
     * The prefix for the customer used to generate unique invoice numbers.
     */
    @SerializedName("invoice_prefix")
    String invoicePrefix;
    @SerializedName("invoice_settings")
    Customer.InvoiceSettings invoiceSettings;

    /**
     * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
     */
    @SerializedName("livemode")
    Boolean livemode;

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
     */
    @Getter(onMethod_ = {@Override})
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * The customer's full name or business name.
     */
    @SerializedName("name")
    String name;

    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    @SerializedName("object")
    String object;

    /**
     * The customer's phone number.
     */
    @SerializedName("phone")
    String phone;

    /**
     * The customer's preferred locales (languages), ordered by preference.
     */
    @SerializedName("preferred_locales")
    List<String> preferredLocales;

    /**
     * Mailing and shipping address for the customer. Appears on invoices emailed to this customer.
     */
    @SerializedName("shipping")
    ShippingDetails shipping;

    /**
     * The customer's payment sources, if any.
     */
    @SerializedName("sources")
    PaymentSourceCollection sources;

    /**
     * The customer's current subscriptions, if any.
     */
    @SerializedName("subscriptions")
    SubscriptionCollection subscriptions;

    /**
     * Describes the customer's tax exemption status. One of `none`, `exempt`, or `reverse`. When set to `reverse`, invoice and receipt PDFs include the text **"Reverse charge"**.
     */
    @SerializedName("tax_exempt")
    String taxExempt;

    /**
     * The customer's tax IDs.
     */
    @SerializedName("tax_ids")
    TaxIdCollection taxIds;

    /**
     * The customer's tax information. Appears on invoices emailed to this customer. This field has been deprecated and will be removed in a future API version, for further information view the [migration guide](https://stripe.com/docs/billing/migration/taxes#moving-from-taxinfo-to-customer-tax-ids).
     */
    @SerializedName("tax_info")
    Customer.TaxInfo taxInfo;

    /**
     * Describes the status of looking up the tax ID provided in `tax_info`. This field has been deprecated and will be removed in a future API version, for further information view the [migration guide](https://stripe.com/docs/billing/migration/taxes#moving-from-taxinfo-to-customer-tax-ids).
     */
    @SerializedName("tax_info_verification")
    Customer.TaxInfoVerification taxInfoVerification;
    /**
     * Get id of expandable `defaultSource` object.
     */
    public String getDefaultSource() {
        return (this.defaultSource != null) ? this.defaultSource.getId() : null;
    }
    public void setDefaultSource(String id) {
        this.defaultSource =
            ApiResource.setExpandableFieldId(id, this.defaultSource);
    }
    /**
     * Get expanded `defaultSource`.
     */
    public PaymentSource getDefaultSourceObject() {
        return (this.defaultSource != null) ? this.defaultSource.getExpanded() : null;
    }
    public void setDefaultSourceObject(PaymentSource expandableObject) {
        this.defaultSource =
            new ExpandableField<PaymentSource>(
                expandableObject.getId(),
                expandableObject
            );
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class InvoiceSettings extends StripeObject {

        /**
         * Default custom fields to be displayed on invoices for this customer.
         */
        @SerializedName("custom_fields")
        List<Invoice.CustomField> customFields;

        /**
         * ID of the default payment method used for subscriptions and invoices for the customer.
         */
        @SerializedName("default_payment_method")
        ExpandableField<PaymentMethod> defaultPaymentMethod;

        /**
         * Default footer to be displayed on invoices for this customer.
         */
        @SerializedName("footer")
        String footer;
        /**
         * Get id of expandable `defaultPaymentMethod` object.
         */
        public String getDefaultPaymentMethod() {
            return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getId() : null;
        }
        public void setDefaultPaymentMethod(String id) {
            this.defaultPaymentMethod =
                ApiResource.setExpandableFieldId(id, this.defaultPaymentMethod);
        }
        /**
         * Get expanded `defaultPaymentMethod`.
         */
        public PaymentMethod getDefaultPaymentMethodObject() {
            return (this.defaultPaymentMethod != null) ? this.defaultPaymentMethod.getExpanded() : null;
        }
        public void setDefaultPaymentMethodObject(
            PaymentMethod expandableObject) {

            this.defaultPaymentMethod =
                new ExpandableField<PaymentMethod>(
                    expandableObject.getId(),
                    expandableObject
                );
        }

    }
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxInfo extends StripeObject {

        /**
         * The customer's tax ID number.
         */
        @SerializedName("tax_id")
        String taxId;

        /**
         * The type of ID number.
         */
        @SerializedName("type")
        String type;

    }
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxInfoVerification extends StripeObject {

        /**
         * The state of verification for this customer. Possible values are `unverified`, `pending`, or `verified`.
         */
        @SerializedName("status")
        String status;

        /**
         * The official name associated with the tax ID returned from the external provider.
         */
        @SerializedName("verified_name")
        String verifiedName;

    }
    /**
     * <p>Creates a new customer object.</p>
     */
    public static Customer create(
        Map<String, Object> params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a new customer object.</p>
     */
    public static Customer create(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/customers", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Customer.class,
            options
        );
    }
    /**
     * <p>Creates a new customer object.</p>
     */
    public static Customer create(
        CustomerCreateParams params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a new customer object.</p>
     */
    public static Customer create(
        CustomerCreateParams params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/customers", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Customer.class,
            options
        );
    }
    /**
     * <p>Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.</p>
     */
    public Customer delete() throws StripeException {
        return delete((Map<String, Object>) null, (RequestOptions) null);
    }
    /**
     * <p>Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.</p>
     */
    public Customer delete(RequestOptions options) throws StripeException {
        return delete((Map<String, Object>) null, options);
    }
    /**
     * <p>Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.</p>
     */
    public Customer delete(Map<String, Object> params) throws StripeException {
        return delete(params, (RequestOptions) null);
    }
    /**
     * <p>Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the customer.</p>
     */
    public Customer delete(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/customers/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.DELETE,
            url,
            params,
            Customer.class,
            options
        );
    }
    /**
     * <p>Removes the currently applied discount on a customer.</p>
     */
    public Discount deleteDiscount() throws StripeException {
        return deleteDiscount(
            (Map<String, Object>) null,
            (RequestOptions) null
        );
    }
    /**
     * <p>Removes the currently applied discount on a customer.</p>
     */
    public Discount deleteDiscount(
        Map<String, Object> params) throws StripeException {

        return deleteDiscount(params, (RequestOptions) null);
    }
    /**
     * <p>Removes the currently applied discount on a customer.</p>
     */
    public Discount deleteDiscount(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/customers/%s/discount",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.DELETE,
            url,
            params,
            Discount.class,
            options
        );
    }
    /**
     * <p>Returns a list of your customers. The customers are returned sorted by creation date, with the most recent customers appearing first.</p>
     */
    public static CustomerCollection list(
        Map<String, Object> params) throws StripeException {

        return list(params, (RequestOptions) null);
    }
    /**
     * <p>Returns a list of your customers. The customers are returned sorted by creation date, with the most recent customers appearing first.</p>
     */
    public static CustomerCollection list(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/customers", Stripe.getApiBase());
        return ApiResource.requestCollection(
            url,
            params,
            CustomerCollection.class,
            options
        );
    }
    /**
     * <p>Returns a list of your customers. The customers are returned sorted by creation date, with the most recent customers appearing first.</p>
     */
    public static CustomerCollection list(
        CustomerListParams params) throws StripeException {

        return list(params, (RequestOptions) null);
    }
    /**
     * <p>Returns a list of your customers. The customers are returned sorted by creation date, with the most recent customers appearing first.</p>
     */
    public static CustomerCollection list(
        CustomerListParams params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/customers", Stripe.getApiBase());
        return ApiResource.requestCollection(
            url,
            params,
            CustomerCollection.class,
            options
        );
    }
    /**
     * <p>Retrieves the details of an existing customer. You need only supply the unique customer identifier that was returned upon customer creation.</p>
     */
    public static Customer retrieve(String customer) throws StripeException {
        return retrieve(
            customer,
            (Map<String, Object>) null,
            (RequestOptions) null
        );
    }
    /**
     * <p>Retrieves the details of an existing customer. You need only supply the unique customer identifier that was returned upon customer creation.</p>
     */
    public static Customer retrieve(
        String customer,
        RequestOptions options) throws StripeException {

        return retrieve(customer, (Map<String, Object>) null, options);
    }
    /**
     * <p>Retrieves the details of an existing customer. You need only supply the unique customer identifier that was returned upon customer creation.</p>
     */
    public static Customer retrieve(
        String customer,
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/customers/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(customer)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Customer.class,
            options
        );
    }
    /**
     * <p>Retrieves the details of an existing customer. You need only supply the unique customer identifier that was returned upon customer creation.</p>
     */
    public static Customer retrieve(
        String customer,
        CustomerRetrieveParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/customers/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(customer)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Customer.class,
            options
        );
    }
    /**
     * <p>Updates the specified customer by setting the values of the parameters passed. Any parameters not provided will be left unchanged. For example, if you pass the <strong>source</strong> parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges in the future. When you update a customer to a new valid card source by passing the <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the subscription bills automatically and is in the <code>past_due</code> state, then the latest open invoice for the subscription with automatic collection enabled will be retried. This retry will not count as an automatic retry, and will not affect the next regularly scheduled payment for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this behavior.</p>
     *
     * <p>This request accepts mostly the same arguments as the customer creation call.</p>
     */
    @Override
    public Customer update(Map<String, Object> params) throws StripeException {
        return update(params, (RequestOptions) null);
    }
    /**
     * <p>Updates the specified customer by setting the values of the parameters passed. Any parameters not provided will be left unchanged. For example, if you pass the <strong>source</strong> parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges in the future. When you update a customer to a new valid card source by passing the <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the subscription bills automatically and is in the <code>past_due</code> state, then the latest open invoice for the subscription with automatic collection enabled will be retried. This retry will not count as an automatic retry, and will not affect the next regularly scheduled payment for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this behavior.</p>
     *
     * <p>This request accepts mostly the same arguments as the customer creation call.</p>
     */
    @Override
    public Customer update(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/customers/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Customer.class,
            options
        );
    }
    /**
     * <p>Updates the specified customer by setting the values of the parameters passed. Any parameters not provided will be left unchanged. For example, if you pass the <strong>source</strong> parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges in the future. When you update a customer to a new valid card source by passing the <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the subscription bills automatically and is in the <code>past_due</code> state, then the latest open invoice for the subscription with automatic collection enabled will be retried. This retry will not count as an automatic retry, and will not affect the next regularly scheduled payment for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this behavior.</p>
     *
     * <p>This request accepts mostly the same arguments as the customer creation call.</p>
     */
    public Customer update(CustomerUpdateParams params) throws StripeException {
        return update(params, (RequestOptions) null);
    }
    /**
     * <p>Updates the specified customer by setting the values of the parameters passed. Any parameters not provided will be left unchanged. For example, if you pass the <strong>source</strong> parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges in the future. When you update a customer to a new valid card source by passing the <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the subscription bills automatically and is in the <code>past_due</code> state, then the latest open invoice for the subscription with automatic collection enabled will be retried. This retry will not count as an automatic retry, and will not affect the next regularly scheduled payment for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger this behavior.</p>
     *
     * <p>This request accepts mostly the same arguments as the customer creation call.</p>
     */
    public Customer update(
        CustomerUpdateParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/customers/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Customer.class,
            options
        );
    }
}