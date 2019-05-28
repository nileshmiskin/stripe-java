package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.SubscriptionScheduleCancelParams;
import com.stripe.param.SubscriptionScheduleCreateParams;
import com.stripe.param.SubscriptionScheduleListParams;
import com.stripe.param.SubscriptionScheduleReleaseParams;
import com.stripe.param.SubscriptionScheduleRetrieveParams;
import com.stripe.param.SubscriptionScheduleRevisionsParams;
import com.stripe.param.SubscriptionScheduleUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriptionSchedule
    extends ApiResource
    implements HasId, MetadataStore<SubscriptionSchedule> {

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay the underlying subscription at the end of each billing cycle using the default source attached to the customer. When sending an invoice, Stripe will email your customer an invoice with payment instructions.
     */
    @SerializedName("billing")
    String billing;

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period.
     */
    @SerializedName("billing_thresholds")
    Subscription.BillingThresholds billingThresholds;

    /**
     * Time at which the subscription schedule was canceled. Measured in seconds since the Unix epoch.
     */
    @SerializedName("canceled_at")
    Long canceledAt;

    /**
     * Time at which the subscription schedule was completed. Measured in seconds since the Unix epoch.
     */
    @SerializedName("completed_at")
    Long completedAt;

    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @SerializedName("created")
    Long created;

    /**
     * Object representing the start and end dates for the current phase of the subscription schedule, if it is `active`.
     */
    @SerializedName("current_phase")
    SubscriptionSchedule.CurrentPhase currentPhase;

    /**
     * ID of the customer who owns the subscription schedule.
     */
    @SerializedName("customer")
    ExpandableField<Customer> customer;

    /**
     * Unique identifier for the object.
     */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * The subscription schedule's default invoice settings.
     */
    @SerializedName("invoice_settings")
    SubscriptionSchedule.InvoiceSettings invoiceSettings;

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
     * String representing the object's type. Objects of the same type share the same value.
     */
    @SerializedName("object")
    String object;

    /**
     * Configuration for the subscription schedule's phases.
     */
    @SerializedName("phases")
    List<SubscriptionSchedule.Phase> phases;

    /**
     * Time at which the subscription schedule was released. Measured in seconds since the Unix epoch.
     */
    @SerializedName("released_at")
    Long releasedAt;

    /**
     * ID of the subscription once managed by the subscription schedule (if it is released).
     */
    @SerializedName("released_subscription")
    String releasedSubscription;

    /**
     * Behavior of the subscription schedule and underlying subscription when it ends.
     */
    @SerializedName("renewal_behavior")
    String renewalBehavior;

    /**
     * Interval and duration at which the subscription schedule renews for when it ends if `renewal_behavior` is `renew`.
     */
    @SerializedName("renewal_interval")
    SubscriptionSchedule.RenewalInterval renewalInterval;

    /**
     * ID of the current revision of the subscription schedule.
     */
    @SerializedName("revision")
    String revision;

    /**
     * Possible values are `not_started`, `active`, `completed`, `released`, and `canceled`.
     */
    @SerializedName("status")
    String status;

    /**
     * ID of the subscription managed by the subscription schedule.
     */
    @SerializedName("subscription")
    ExpandableField<Subscription> subscription;
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
    public static class InvoiceSettings extends StripeObject {

        /**
         * Number of days within which a customer must pay invoices generated by this subscription schedule. This value will be `null` for subscription schedules where `billing=charge_automatically`.
         */
        @SerializedName("days_until_due")
        Long daysUntilDue;

    }
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PhaseItem extends StripeObject {

        /**
         * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
         */
        @SerializedName("billing_thresholds")
        SubscriptionItem.BillingThresholds billingThresholds;

        /**
         * ID of the plan to which the customer should be subscribed.
         */
        @SerializedName("plan")
        ExpandableField<Plan> plan;

        /**
         * Quantity of the plan to which the customer should be subscribed.
         */
        @SerializedName("quantity")
        Long quantity;

        /**
         * The tax rates which apply to this `phase_item`. When set, the `default_tax_rates` on the phase do not apply to this `phase_item`.
         */
        @SerializedName("tax_rates")
        List<TaxRate> taxRates;
        /**
         * Get id of expandable `plan` object.
         */
        public String getPlan() {
            return (this.plan != null) ? this.plan.getId() : null;
        }
        public void setPlan(String id) {
            this.plan = ApiResource.setExpandableFieldId(id, this.plan);
        }
        /**
         * Get expanded `plan`.
         */
        public Plan getPlanObject() {
            return (this.plan != null) ? this.plan.getExpanded() : null;
        }
        public void setPlanObject(Plan expandableObject) {
            this.plan =
                new ExpandableField<Plan>(
                    expandableObject.getId(),
                    expandableObject
                );
        }

    }
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CurrentPhase extends StripeObject {
        @SerializedName("end_date")
        Long endDate;
        @SerializedName("start_date")
        Long startDate;

    }
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Phase extends StripeObject {

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the subscription invoice subtotal that will be transferred to the application owner's Stripe account during this phase of the schedule.
         */
        @SerializedName("application_fee_percent")
        BigDecimal applicationFeePercent;

        /**
         * ID of the coupon to use during this phase of the subscription schedule.
         */
        @SerializedName("coupon")
        ExpandableField<Coupon> coupon;
        @SerializedName("default_tax_rates")
        List<TaxRate> defaultTaxRates;

        /**
         * The end of this phase of the subscription schedule.
         */
        @SerializedName("end_date")
        Long endDate;

        /**
         * Plans to subscribe during this phase of the subscription schedule.
         */
        @SerializedName("plans")
        List<SubscriptionSchedule.PhaseItem> plans;

        /**
         * The start of this phase of the subscription schedule.
         */
        @SerializedName("start_date")
        Long startDate;

        /**
         * If provided, each invoice created during this phase of the subscription schedule will apply the tax rate, increasing the amount billed to the customer.
         */
        @SerializedName("tax_percent")
        BigDecimal taxPercent;

        /**
         * When the trial ends within the phase.
         */
        @SerializedName("trial_end")
        Long trialEnd;
        /**
         * Get id of expandable `coupon` object.
         */
        public String getCoupon() {
            return (this.coupon != null) ? this.coupon.getId() : null;
        }
        public void setCoupon(String id) {
            this.coupon = ApiResource.setExpandableFieldId(id, this.coupon);
        }
        /**
         * Get expanded `coupon`.
         */
        public Coupon getCouponObject() {
            return (this.coupon != null) ? this.coupon.getExpanded() : null;
        }
        public void setCouponObject(Coupon expandableObject) {
            this.coupon =
                new ExpandableField<Coupon>(
                    expandableObject.getId(),
                    expandableObject
                );
        }

    }
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RenewalInterval extends StripeObject {

        /**
         * Interval at which to renew the subscription schedule for when it ends.
         */
        @SerializedName("interval")
        String interval;

        /**
         * Number of intervals to renew the subscription schedule for when it ends.
         */
        @SerializedName("length")
        Long length;

    }
    /**
     * <p>Cancels a subscription schedule and its associated subscription immediately (if the subscription schedule has an active subscription). A subscription schedule can only be canceled if its status is <code>not_started</code> or <code>active</code>.</p>
     */
    public SubscriptionSchedule cancel() throws StripeException {
        return cancel((Map<String, Object>) null, (RequestOptions) null);
    }
    /**
     * <p>Cancels a subscription schedule and its associated subscription immediately (if the subscription schedule has an active subscription). A subscription schedule can only be canceled if its status is <code>not_started</code> or <code>active</code>.</p>
     */
    public SubscriptionSchedule cancel(
        RequestOptions options) throws StripeException {

        return cancel((Map<String, Object>) null, options);
    }
    /**
     * <p>Cancels a subscription schedule and its associated subscription immediately (if the subscription schedule has an active subscription). A subscription schedule can only be canceled if its status is <code>not_started</code> or <code>active</code>.</p>
     */
    public SubscriptionSchedule cancel(
        Map<String, Object> params) throws StripeException {

        return cancel(params, (RequestOptions) null);
    }
    /**
     * <p>Cancels a subscription schedule and its associated subscription immediately (if the subscription schedule has an active subscription). A subscription schedule can only be canceled if its status is <code>not_started</code> or <code>active</code>.</p>
     */
    public SubscriptionSchedule cancel(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s/cancel",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Cancels a subscription schedule and its associated subscription immediately (if the subscription schedule has an active subscription). A subscription schedule can only be canceled if its status is <code>not_started</code> or <code>active</code>.</p>
     */
    public SubscriptionSchedule cancel(
        SubscriptionScheduleCancelParams params) throws StripeException {

        return cancel(params, (RequestOptions) null);
    }
    /**
     * <p>Cancels a subscription schedule and its associated subscription immediately (if the subscription schedule has an active subscription). A subscription schedule can only be canceled if its status is <code>not_started</code> or <code>active</code>.</p>
     */
    public SubscriptionSchedule cancel(
        SubscriptionScheduleCancelParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s/cancel",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Creates a new subscription schedule object.</p>
     */
    public static SubscriptionSchedule create(
        Map<String, Object> params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a new subscription schedule object.</p>
     */
    public static SubscriptionSchedule create(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format("%s/v1/subscription_schedules", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Creates a new subscription schedule object.</p>
     */
    public static SubscriptionSchedule create(
        SubscriptionScheduleCreateParams params) throws StripeException {

        return create(params, (RequestOptions) null);
    }
    /**
     * <p>Creates a new subscription schedule object.</p>
     */
    public static SubscriptionSchedule create(
        SubscriptionScheduleCreateParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format("%s/v1/subscription_schedules", Stripe.getApiBase());
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Retrieves the list of your subscription schedules.</p>
     */
    public static SubscriptionScheduleCollection list(
        Map<String, Object> params) throws StripeException {

        return list(params, (RequestOptions) null);
    }
    /**
     * <p>Retrieves the list of your subscription schedules.</p>
     */
    public static SubscriptionScheduleCollection list(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format("%s/v1/subscription_schedules", Stripe.getApiBase());
        return ApiResource.requestCollection(
            url,
            params,
            SubscriptionScheduleCollection.class,
            options
        );
    }
    /**
     * <p>Retrieves the list of your subscription schedules.</p>
     */
    public static SubscriptionScheduleCollection list(
        SubscriptionScheduleListParams params) throws StripeException {

        return list(params, (RequestOptions) null);
    }
    /**
     * <p>Retrieves the list of your subscription schedules.</p>
     */
    public static SubscriptionScheduleCollection list(
        SubscriptionScheduleListParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format("%s/v1/subscription_schedules", Stripe.getApiBase());
        return ApiResource.requestCollection(
            url,
            params,
            SubscriptionScheduleCollection.class,
            options
        );
    }
    /**
     * <p>Releases the subscription schedule immediately, which will stop scheduling of its phases, but leave any existing subscription in place. A schedule can only be released if its status is <code>not_started</code> or <code>active</code>. If the subscription schedule is currently associated with a subscription, releasing it will remove its <code>subscription</code> property and set the subscription’s ID to the <code>released_subscription</code> property.</p>
     */
    public SubscriptionSchedule release() throws StripeException {
        return release((Map<String, Object>) null, (RequestOptions) null);
    }
    /**
     * <p>Releases the subscription schedule immediately, which will stop scheduling of its phases, but leave any existing subscription in place. A schedule can only be released if its status is <code>not_started</code> or <code>active</code>. If the subscription schedule is currently associated with a subscription, releasing it will remove its <code>subscription</code> property and set the subscription’s ID to the <code>released_subscription</code> property.</p>
     */
    public SubscriptionSchedule release(
        RequestOptions options) throws StripeException {

        return release((Map<String, Object>) null, options);
    }
    /**
     * <p>Releases the subscription schedule immediately, which will stop scheduling of its phases, but leave any existing subscription in place. A schedule can only be released if its status is <code>not_started</code> or <code>active</code>. If the subscription schedule is currently associated with a subscription, releasing it will remove its <code>subscription</code> property and set the subscription’s ID to the <code>released_subscription</code> property.</p>
     */
    public SubscriptionSchedule release(
        Map<String, Object> params) throws StripeException {

        return release(params, (RequestOptions) null);
    }
    /**
     * <p>Releases the subscription schedule immediately, which will stop scheduling of its phases, but leave any existing subscription in place. A schedule can only be released if its status is <code>not_started</code> or <code>active</code>. If the subscription schedule is currently associated with a subscription, releasing it will remove its <code>subscription</code> property and set the subscription’s ID to the <code>released_subscription</code> property.</p>
     */
    public SubscriptionSchedule release(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s/release",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Releases the subscription schedule immediately, which will stop scheduling of its phases, but leave any existing subscription in place. A schedule can only be released if its status is <code>not_started</code> or <code>active</code>. If the subscription schedule is currently associated with a subscription, releasing it will remove its <code>subscription</code> property and set the subscription’s ID to the <code>released_subscription</code> property.</p>
     */
    public SubscriptionSchedule release(
        SubscriptionScheduleReleaseParams params) throws StripeException {

        return release(params, (RequestOptions) null);
    }
    /**
     * <p>Releases the subscription schedule immediately, which will stop scheduling of its phases, but leave any existing subscription in place. A schedule can only be released if its status is <code>not_started</code> or <code>active</code>. If the subscription schedule is currently associated with a subscription, releasing it will remove its <code>subscription</code> property and set the subscription’s ID to the <code>released_subscription</code> property.</p>
     */
    public SubscriptionSchedule release(
        SubscriptionScheduleReleaseParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s/release",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Retrieves the details of an existing subscription schedule. You only need to supply the unique subscription schedule identifier that was returned upon subscription schedule creation.</p>
     */
    public static SubscriptionSchedule retrieve(
        String schedule) throws StripeException {

        return retrieve(
            schedule,
            (Map<String, Object>) null,
            (RequestOptions) null
        );
    }
    /**
     * <p>Retrieves the details of an existing subscription schedule. You only need to supply the unique subscription schedule identifier that was returned upon subscription schedule creation.</p>
     */
    public static SubscriptionSchedule retrieve(
        String schedule,
        RequestOptions options) throws StripeException {

        return retrieve(schedule, (Map<String, Object>) null, options);
    }
    /**
     * <p>Retrieves the details of an existing subscription schedule. You only need to supply the unique subscription schedule identifier that was returned upon subscription schedule creation.</p>
     */
    public static SubscriptionSchedule retrieve(
        String schedule,
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(schedule)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Retrieves the details of an existing subscription schedule. You only need to supply the unique subscription schedule identifier that was returned upon subscription schedule creation.</p>
     */
    public static SubscriptionSchedule retrieve(
        String schedule,
        SubscriptionScheduleRetrieveParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(schedule)
            );
        return ApiResource.request(
            ApiResource.RequestMethod.GET,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Retrieves the list of subscription schedule revisions for a subscription schedule.</p>
     */
    public SubscriptionScheduleRevisionCollection revisions()
        throws StripeException {

        return revisions((Map<String, Object>) null, (RequestOptions) null);
    }
    /**
     * <p>Retrieves the list of subscription schedule revisions for a subscription schedule.</p>
     */
    public SubscriptionScheduleRevisionCollection revisions(
        Map<String, Object> params) throws StripeException {

        return revisions(params, (RequestOptions) null);
    }
    /**
     * <p>Retrieves the list of subscription schedule revisions for a subscription schedule.</p>
     */
    public SubscriptionScheduleRevisionCollection revisions(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s/revisions",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.requestCollection(
            url,
            params,
            SubscriptionScheduleRevisionCollection.class,
            options
        );
    }
    /**
     * <p>Retrieves the list of subscription schedule revisions for a subscription schedule.</p>
     */
    public SubscriptionScheduleRevisionCollection revisions(
        SubscriptionScheduleRevisionsParams params) throws StripeException {

        return revisions(params, (RequestOptions) null);
    }
    /**
     * <p>Retrieves the list of subscription schedule revisions for a subscription schedule.</p>
     */
    public SubscriptionScheduleRevisionCollection revisions(
        SubscriptionScheduleRevisionsParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s/revisions",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.requestCollection(
            url,
            params,
            SubscriptionScheduleRevisionCollection.class,
            options
        );
    }
    /**
     * <p>Updates an existing subscription schedule.</p>
     */
    @Override
    public SubscriptionSchedule update(
        Map<String, Object> params) throws StripeException {

        return update(params, (RequestOptions) null);
    }
    /**
     * <p>Updates an existing subscription schedule.</p>
     */
    @Override
    public SubscriptionSchedule update(
        Map<String, Object> params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
    /**
     * <p>Updates an existing subscription schedule.</p>
     */
    public SubscriptionSchedule update(
        SubscriptionScheduleUpdateParams params) throws StripeException {

        return update(params, (RequestOptions) null);
    }
    /**
     * <p>Updates an existing subscription schedule.</p>
     */
    public SubscriptionSchedule update(
        SubscriptionScheduleUpdateParams params,
        RequestOptions options) throws StripeException {

        String url =
            String.format(
                "%s/v1/subscription_schedules/%s",
                Stripe.getApiBase(),
                ApiResource.urlEncodeId(this.getId())
            );
        return ApiResource.request(
            ApiResource.RequestMethod.POST,
            url,
            params,
            SubscriptionSchedule.class,
            options
        );
    }
}