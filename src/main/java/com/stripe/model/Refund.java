package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.RefundCreateParams;
import com.stripe.param.RefundListParams;
import com.stripe.param.RefundRetrieveParams;
import com.stripe.param.RefundUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Refund
    extends ApiResource
    implements MetadataStore<Refund>, BalanceTransactionSource {

    /**
     * Amount, in %s.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Balance transaction that describes the impact on your account balance.
     */
    @SerializedName("balance_transaction")
    ExpandableField<BalanceTransaction> balanceTransaction;

    /**
     * ID of the charge that was refunded.
     */
    @SerializedName("charge")
    ExpandableField<Charge> charge;

    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @SerializedName("created")
    Long created;

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    @SerializedName("currency")
    String currency;

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users. (Available on non-card refunds only)
     */
    @SerializedName("description")
    String description;

    /**
     * If the refund failed, this balance transaction describes the adjustment made on your account balance that reverses the initial balance transaction.
     */
    @SerializedName("failure_balance_transaction")
    ExpandableField<BalanceTransaction> failureBalanceTransaction;

    /**
     * If the refund failed, the reason for refund failure if known. Possible values are `lost_or_stolen_card`, `expired_or_canceled_card`, or `unknown`.
     */
    @SerializedName("failure_reason")
    String failureReason;

    /**
     * Unique identifier for the object.
     */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
     */
    @Getter(onMethod_ = {@Override})
    @SerializedName("metadata")
    Map<String, String> metadata;

    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    @SerializedName("object")
    String object;

    /**
     * Reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and `requested_by_customer`.
     */
    @SerializedName("reason")
    String reason;

    /**
     * This is the transaction number that appears on email receipts sent for this refund.
     */
    @SerializedName("receipt_number")
    String receiptNumber;

    /**
     * The transfer reversal that is associated with the refund. Only present if the charge came from another Stripe account. See the Connect documentation for details.
     */
    @SerializedName("source_transfer_reversal")
    ExpandableField<TransferReversal> sourceTransferReversal;

    /**
     * Status of the refund. For credit card refunds, this can be `pending`, `succeeded`, or `failed`. For other types of refunds, it can be `pending`, `succeeded`, `failed`, or `canceled`. Refer to our [refunds](https://stripe.com/docs/refunds#failed-refunds) documentation for more details.
     */
    @SerializedName("status")
    String status;

    /**
     * If the accompanying transfer was reversed, the transfer reversal object. Only applicable if the charge was created using the destination parameter.
     */
    @SerializedName("transfer_reversal")
    ExpandableField<TransferReversal> transferReversal;
    /**
     * Get id of expandable `balanceTransaction` object.
     */
    public String getBalanceTransaction() {
        return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
    }
    public void setBalanceTransaction(String id) {
        this.balanceTransaction =
            ApiResource.setExpandableFieldId(id, this.balanceTransaction);
    }
    /**
     * Get expanded `balanceTransaction`.
     */
    public BalanceTransaction getBalanceTransactionObject() {
        return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
    }
    public void setBalanceTransactionObject(
        BalanceTransaction expandableObject) {

        this.balanceTransaction =
            new ExpandableField<BalanceTransaction>(
                expandableObject.getId(),
                expandableObject
            );
    }
    /**
     * Get id of expandable `charge` object.
     */
    public String getCharge() {
        return (this.charge != null) ? this.charge.getId() : null;
    }
    public void setCharge(String id) {
        this.charge = ApiResource.setExpandableFieldId(id, this.charge);
    }
    /**
     * Get expanded `charge`.
     */
    public Charge getChargeObject() {
        return (this.charge != null) ? this.charge.getExpanded() : null;
    }
    public void setChargeObject(Charge expandableObject) {
        this.charge =
            new ExpandableField<Charge>(
                expandableObject.getId(),
                expandableObject
            );
    }
    /**
     * Get id of expandable `failureBalanceTransaction` object.
     */
    public String getFailureBalanceTransaction() {
        return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getId() : null;
    }
    public void setFailureBalanceTransaction(String id) {
        this.failureBalanceTransaction =
            ApiResource.setExpandableFieldId(
                id,
                this.failureBalanceTransaction
            );
    }
    /**
     * Get expanded `failureBalanceTransaction`.
     */
    public BalanceTransaction getFailureBalanceTransactionObject() {
        return (this.failureBalanceTransaction != null) ? this.failureBalanceTransaction.getExpanded() : null;
    }
    public void setFailureBalanceTransactionObject(
        BalanceTransaction expandableObject) {

        this.failureBalanceTransaction =
            new ExpandableField<BalanceTransaction>(
                expandableObject.getId(),
                expandableObject
            );
    }
    /**
     * Get id of expandable `sourceTransferReversal` object.
     */
    public String getSourceTransferReversal() {
        return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getId() : null;
    }
    public void setSourceTransferReversal(String id) {
        this.sourceTransferReversal =
            ApiResource.setExpandableFieldId(id, this.sourceTransferReversal);
    }
    /**
     * Get expanded `sourceTransferReversal`.
     */
    public TransferReversal getSourceTransferReversalObject() {
        return (this.sourceTransferReversal != null) ? this.sourceTransferReversal.getExpanded() : null;
    }
    public void setSourceTransferReversalObject(
        TransferReversal expandableObject) {

        this.sourceTransferReversal =
            new ExpandableField<TransferReversal>(
                expandableObject.getId(),
                expandableObject
            );
    }
    /**
     * Get id of expandable `transferReversal` object.
     */
    public String getTransferReversal() {
        return (this.transferReversal != null) ? this.transferReversal.getId() : null;
    }
    public void setTransferReversal(String id) {
        this.transferReversal =
            ApiResource.setExpandableFieldId(id, this.transferReversal);
    }
    /**
     * Get expanded `transferReversal`.
     */
    public TransferReversal getTransferReversalObject() {
        return (this.transferReversal != null) ? this.transferReversal.getExpanded() : null;
    }
    public void setTransferReversalObject(TransferReversal expandableObject) {
        this.transferReversal =
            new ExpandableField<TransferReversal>(
                expandableObject.getId(),
                expandableObject
            );
    }

    /**
     * <p>Create a refund.</p>
     */
    public static Refund create(
        Map<String, Object> params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Create a refund.</p>
     */
    public static Refund create(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/refunds", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Refund.class,
            options
        );
    }
    /**
     * <p>Create a refund.</p>
     */
    public static Refund create(
        RefundCreateParams params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Create a refund.</p>
     */
    public static Refund create(
        RefundCreateParams params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/refunds", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Refund.class,
            options
        );
    }
    /**
     * <p>Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order, with the most recent refunds appearing first. For convenience, the 10 most recent refunds are always available by default on the charge object.</p>
     */
    public static RefundCollection list(
        Map<String, Object> params) throws StripeException {

        return list(params, (RequestOptions) null);
    }
    /**
     * <p>Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order, with the most recent refunds appearing first. For convenience, the 10 most recent refunds are always available by default on the charge object.</p>
     */
    public static RefundCollection list(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/refunds", Stripe.getApiBase());
        return ApiResource.requestCollection(
            url,
            params,
            RefundCollection.class,
            options
        );
    }
    /**
     * <p>Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order, with the most recent refunds appearing first. For convenience, the 10 most recent refunds are always available by default on the charge object.</p>
     */
    public static RefundCollection list(
        RefundListParams params) throws StripeException {

        return list(params, (RequestOptions) null);
    }
    /**
     * <p>Returns a list of all refunds you’ve previously created. The refunds are returned in sorted order, with the most recent refunds appearing first. For convenience, the 10 most recent refunds are always available by default on the charge object.</p>
     */
    public static RefundCollection list(
        RefundListParams params,
        RequestOptions options) throws StripeException {

        String url = String.format("%s/v1/refunds", Stripe.getApiBase());
        return ApiResource.requestCollection(
            url,
            params,
            RefundCollection.class,
            options
        );
    }
    /**
     * <p>Retrieves the details of an existing refund.</p>
     */
    public static Refund retrieve(String refund) throws StripeException {
        return retrieve(
            refund,
            (Map<String, Object>) null,
            (RequestOptions) null
        );
    }
    /**
     * <p>Retrieves the details of an existing refund.</p>
     */
    public static Refund retrieve(
        String refund,
        RequestOptions options) throws StripeException {

        return retrieve(refund, (Map<String, Object>) null, options);
    }
    /**
     * <p>Retrieves the details of an existing refund.</p>
     */
    public static Refund retrieve(
        String refund,
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/refunds/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(refund)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Refund.class,
            options
        );
    }
    /**
     * <p>Retrieves the details of an existing refund.</p>
     */
    public static Refund retrieve(
        String refund,
        RefundRetrieveParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/refunds/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(refund)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            Refund.class,
            options
        );
    }
    /**
     * <p>Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.</p>
     *
     * <p>This request only accepts <code>metadata</code> as an argument.</p>
     */
    @Override
    public Refund update(Map<String, Object> params) throws StripeException {
        return update(params, (RequestOptions) null);
    }
    /**
     * <p>Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.</p>
     *
     * <p>This request only accepts <code>metadata</code> as an argument.</p>
     */
    @Override
    public Refund update(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/refunds/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Refund.class,
            options
        );
    }
    /**
     * <p>Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.</p>
     *
     * <p>This request only accepts <code>metadata</code> as an argument.</p>
     */
    public Refund update(RefundUpdateParams params) throws StripeException {
        return update(params, (RequestOptions) null);
    }
    /**
     * <p>Updates the specified refund by setting the values of the parameters passed. Any parameters not provided will be left unchanged.</p>
     *
     * <p>This request only accepts <code>metadata</code> as an argument.</p>
     */
    public Refund update(
        RefundUpdateParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/refunds/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            Refund.class,
            options
        );
    }
}