// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Invoice;
import com.stripe.model.InvoiceCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.InvoiceCreateParams;
import com.stripe.param.InvoiceDeleteParams;
import com.stripe.param.InvoiceFinalizeInvoiceParams;
import com.stripe.param.InvoiceListParams;
import com.stripe.param.InvoiceMarkUncollectibleParams;
import com.stripe.param.InvoicePayParams;
import com.stripe.param.InvoiceRetrieveParams;
import com.stripe.param.InvoiceSendInvoiceParams;
import com.stripe.param.InvoiceUpcomingParams;
import com.stripe.param.InvoiceUpdateParams;
import com.stripe.param.InvoiceVoidInvoiceParams;

/**
 * Service class for {@link Invoice}, and is now a preferred way to making API requests.The original
 * methods in model class will be marked deprecated in the next major version.
 */
public class InvoiceService extends ApiService {
  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations.
   */
  public Invoice create(InvoiceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * This endpoint creates a draft invoice for a given customer. The draft invoice created pulls in
   * all pending invoice items on that customer, including prorations.
   */
  public Invoice create(InvoiceCreateParams params, RequestOptions options) throws StripeException {
    String url = resourceUrl("/v1/invoices");
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Permanently deletes a draft invoice. This cannot be undone. Attempts to delete invoices that
   * are no longer in a draft state will fail; once an invoice has been finalized, it must be <a
   * href="#void_invoice">voided</a>.
   */
  public Invoice delete(String invoice, InvoiceDeleteParams params) throws StripeException {
    return delete(invoice, params, (RequestOptions) null);
  }

  /**
   * Permanently deletes a draft invoice. This cannot be undone. Attempts to delete invoices that
   * are no longer in a draft state will fail; once an invoice has been finalized, it must be <a
   * href="#void_invoice">voided</a>.
   */
  public Invoice delete(String invoice, InvoiceDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s", invoice);
    return request(ApiResource.RequestMethod.DELETE, url, params, Invoice.class, options);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(String invoice, InvoiceFinalizeInvoiceParams params)
      throws StripeException {
    return finalizeInvoice(invoice, params, (RequestOptions) null);
  }

  /**
   * Stripe automatically finalizes drafts before sending and attempting payment on invoices.
   * However, if you’d like to finalize a draft invoice manually, you can do so using this method.
   */
  public Invoice finalizeInvoice(
      String invoice, InvoiceFinalizeInvoiceParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s/finalize", invoice);
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public InvoiceCollection list(InvoiceListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * You can list all invoices, or list the invoices for a specific customer. The invoices are
   * returned sorted by creation date, with the most recently created invoices appearing first.
   */
  public InvoiceCollection list(InvoiceListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices");
    return requestCollection(url, params, InvoiceCollection.class, options);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(String invoice, InvoiceMarkUncollectibleParams params)
      throws StripeException {
    return markUncollectible(invoice, params, (RequestOptions) null);
  }

  /**
   * Marking an invoice as uncollectible is useful for keeping track of bad debts that can be
   * written off for accounting purposes.
   */
  public Invoice markUncollectible(
      String invoice, InvoiceMarkUncollectibleParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s/mark_uncollectible", invoice);
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(String invoice, InvoicePayParams params) throws StripeException {
    return pay(invoice, params, (RequestOptions) null);
  }

  /**
   * Stripe automatically creates and then attempts to collect payment on invoices for customers on
   * subscriptions according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to attempt payment on an invoice out of the normal collection schedule
   * or for some other reason, you can do so.
   */
  public Invoice pay(String invoice, InvoicePayParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s/pay", invoice);
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /** Retrieves the invoice with the given ID. */
  public Invoice retrieve(String invoice, InvoiceRetrieveParams params) throws StripeException {
    return retrieve(invoice, params, (RequestOptions) null);
  }

  /** Retrieves the invoice with the given ID. */
  public Invoice retrieve(String invoice, InvoiceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s", invoice);
    return request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(String invoice, InvoiceSendInvoiceParams params)
      throws StripeException {
    return sendInvoice(invoice, params, (RequestOptions) null);
  }

  /**
   * Stripe will automatically send invoices to customers according to your <a
   * href="https://dashboard.stripe.com/account/billing/automatic">subscriptions settings</a>.
   * However, if you’d like to manually send an invoice to your customer out of the normal schedule,
   * you can do so. When sending invoices that have already been paid, there will be no reference to
   * the payment in the email.
   *
   * <p>Requests made in test-mode result in no emails being sent, despite sending an <code>
   * invoice.sent</code> event.
   */
  public Invoice sendInvoice(
      String invoice, InvoiceSendInvoiceParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s/send", invoice);
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * At any time, you can preview the upcoming invoice for a customer. This will show you all the
   * charges that are pending, including subscription renewal charges, invoice item charges, etc. It
   * will also show you any discount that is applicable to the customer.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>You can preview the effects of updating a subscription, including a preview of what
   * proration will take place. To ensure that the actual proration is calculated exactly the same
   * as the previewed proration, you should pass a <code>proration_date</code> parameter when doing
   * the actual subscription update. The value passed in should be the same as the <code>
   * subscription_proration_date</code> returned on the upcoming invoice resource. The recommended
   * way to get only the prorations being previewed is to consider only proration line items where
   * <code>period[start]</code> is equal to the <code>subscription_proration_date</code> on the
   * upcoming invoice resource.
   */
  public Invoice upcoming(InvoiceUpcomingParams params) throws StripeException {
    return upcoming(params, (RequestOptions) null);
  }

  /**
   * At any time, you can preview the upcoming invoice for a customer. This will show you all the
   * charges that are pending, including subscription renewal charges, invoice item charges, etc. It
   * will also show you any discount that is applicable to the customer.
   *
   * <p>Note that when you are viewing an upcoming invoice, you are simply viewing a preview – the
   * invoice has not yet been created. As such, the upcoming invoice will not show up in invoice
   * listing calls, and you cannot use the API to pay or edit the invoice. If you want to change the
   * amount that your customer will be billed, you can add, remove, or update pending invoice items,
   * or update the customer’s discount.
   *
   * <p>You can preview the effects of updating a subscription, including a preview of what
   * proration will take place. To ensure that the actual proration is calculated exactly the same
   * as the previewed proration, you should pass a <code>proration_date</code> parameter when doing
   * the actual subscription update. The value passed in should be the same as the <code>
   * subscription_proration_date</code> returned on the upcoming invoice resource. The recommended
   * way to get only the prorations being previewed is to consider only proration line items where
   * <code>period[start]</code> is equal to the <code>subscription_proration_date</code> on the
   * upcoming invoice resource.
   */
  public Invoice upcoming(InvoiceUpcomingParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/upcoming");
    return request(ApiResource.RequestMethod.GET, url, params, Invoice.class, options);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>billing</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
   */
  public Invoice update(String invoice, InvoiceUpdateParams params) throws StripeException {
    return update(invoice, params, (RequestOptions) null);
  }

  /**
   * Draft invoices are fully editable. Once an invoice is <a
   * href="/docs/billing/invoices/workflow#finalized">finalized</a>, monetary values, as well as
   * <code>billing</code>, become uneditable.
   *
   * <p>If you would like to stop the Stripe Billing engine from automatically finalizing,
   * reattempting payments on, sending reminders for, or <a
   * href="/docs/billing/invoices/reconciliation">automatically reconciling</a> invoices, pass
   * <code>auto_advance=false</code>.
   */
  public Invoice update(String invoice, InvoiceUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s", invoice);
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(String invoice, InvoiceVoidInvoiceParams params)
      throws StripeException {
    return voidInvoice(invoice, params, (RequestOptions) null);
  }

  /**
   * Mark a finalized invoice as void. This cannot be undone. Voiding an invoice is similar to <a
   * href="#delete_invoice">deletion</a>, however it only applies to finalized invoices and
   * maintains a papertrail where the invoice can still be found.
   */
  public Invoice voidInvoice(
      String invoice, InvoiceVoidInvoiceParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/invoices/%s/void", invoice);
    return request(ApiResource.RequestMethod.POST, url, params, Invoice.class, options);
  }
}
