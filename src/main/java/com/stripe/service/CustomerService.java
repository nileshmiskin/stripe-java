// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import com.stripe.model.Discount;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.CustomerDeleteDiscountParams;
import com.stripe.param.CustomerDeleteParams;
import com.stripe.param.CustomerListParams;
import com.stripe.param.CustomerRetrieveParams;
import com.stripe.param.CustomerUpdateParams;

/**
 * Service class for {@link Customer}, and is now a preferred way to making API requests.The
 * original methods in model class will be marked deprecated in the next major version.
 */
public class CustomerService extends ApiService {
  /** Creates a new customer object. */
  public Customer create(CustomerCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new customer object. */
  public Customer create(CustomerCreateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers");
    return request(ApiResource.RequestMethod.POST, url, params, Customer.class, options);
  }

  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete(String customer, CustomerDeleteParams params) throws StripeException {
    return delete(customer, params, (RequestOptions) null);
  }

  /**
   * Permanently deletes a customer. It cannot be undone. Also immediately cancels any active
   * subscriptions on the customer.
   */
  public Customer delete(String customer, CustomerDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s", customer);
    return request(ApiResource.RequestMethod.DELETE, url, params, Customer.class, options);
  }

  /** Removes the currently applied discount on a customer. */
  public Discount deleteDiscount(String customer, CustomerDeleteDiscountParams params)
      throws StripeException {
    return deleteDiscount(customer, params, (RequestOptions) null);
  }

  /** Removes the currently applied discount on a customer. */
  public Discount deleteDiscount(
      String customer, CustomerDeleteDiscountParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/discount", customer);
    return request(ApiResource.RequestMethod.DELETE, url, params, Discount.class, options);
  }

  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public CustomerCollection list(CustomerListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of your customers. The customers are returned sorted by creation date, with the
   * most recent customers appearing first.
   */
  public CustomerCollection list(CustomerListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers");
    return requestCollection(url, params, CustomerCollection.class, options);
  }

  /**
   * Retrieves the details of an existing customer. You need only supply the unique customer
   * identifier that was returned upon customer creation.
   */
  public Customer retrieve(String customer, CustomerRetrieveParams params) throws StripeException {
    return retrieve(customer, params, (RequestOptions) null);
  }

  /**
   * Retrieves the details of an existing customer. You need only supply the unique customer
   * identifier that was returned upon customer creation.
   */
  public Customer retrieve(String customer, CustomerRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s", customer);
    return request(ApiResource.RequestMethod.GET, url, params, Customer.class, options);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the <code>past_due</code> state, then the latest
   * open invoice for the subscription with automatic collection enabled will be retried. This retry
   * will not count as an automatic retry, and will not affect the next regularly scheduled payment
   * for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger
   * this behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(String customer, CustomerUpdateParams params) throws StripeException {
    return update(customer, params, (RequestOptions) null);
  }

  /**
   * Updates the specified customer by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged. For example, if you pass the <strong>source</strong>
   * parameter, that becomes the customer’s active source (e.g., a card) to be used for all charges
   * in the future. When you update a customer to a new valid card source by passing the
   * <strong>source</strong> parameter: for each of the customer’s current subscriptions, if the
   * subscription bills automatically and is in the <code>past_due</code> state, then the latest
   * open invoice for the subscription with automatic collection enabled will be retried. This retry
   * will not count as an automatic retry, and will not affect the next regularly scheduled payment
   * for the invoice. Changing the <strong>default_source</strong> for a customer will not trigger
   * this behavior.
   *
   * <p>This request accepts mostly the same arguments as the customer creation call.
   */
  public Customer update(String customer, CustomerUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s", customer);
    return request(ApiResource.RequestMethod.POST, url, params, Customer.class, options);
  }
}
