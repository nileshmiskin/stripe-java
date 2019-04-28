// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Source;
import com.stripe.model.SourceTransactionCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.SourceCreateParams;
import com.stripe.param.SourceDetachParams;
import com.stripe.param.SourceRetrieveParams;
import com.stripe.param.SourceSourceTransactionsParams;
import com.stripe.param.SourceUpdateParams;
import com.stripe.param.SourceVerifyParams;

/**
 * Service class for {@link Source}, and is now a preferred way to making API requests.The original
 * methods in model class will be marked deprecated in the next major version.
 */
public class SourceService extends ApiService {
  /** Creates a new source object. */
  public Source create(SourceCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new source object. */
  public Source create(SourceCreateParams params, RequestOptions options) throws StripeException {
    String url = resourceUrl("/v1/sources");
    return request(ApiResource.RequestMethod.POST, url, params, Source.class, options);
  }

  /** Delete a specified source for a given customer. */
  public Source detach(String customer, String id, SourceDetachParams params)
      throws StripeException {
    return detach(customer, id, params, (RequestOptions) null);
  }

  /** Delete a specified source for a given customer. */
  public Source detach(
      String customer, String id, SourceDetachParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/customers/%s/sources/%s", customer, id);
    return request(ApiResource.RequestMethod.DELETE, url, params, Source.class, options);
  }

  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public Source retrieve(String source, SourceRetrieveParams params) throws StripeException {
    return retrieve(source, params, (RequestOptions) null);
  }

  /**
   * Retrieves an existing source object. Supply the unique source ID from a source creation request
   * and Stripe will return the corresponding up-to-date source object information.
   */
  public Source retrieve(String source, SourceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/sources/%s", source);
    return request(ApiResource.RequestMethod.GET, url, params, Source.class, options);
  }

  /** List source transactions for a given source. */
  public SourceTransactionCollection sourceTransactions(
      String source, SourceSourceTransactionsParams params) throws StripeException {
    return sourceTransactions(source, params, (RequestOptions) null);
  }

  /** List source transactions for a given source. */
  public SourceTransactionCollection sourceTransactions(
      String source, SourceSourceTransactionsParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/sources/%s/source_transactions", source);
    return requestCollection(url, params, SourceTransactionCollection.class, options);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the <code>metadata</code> and <code>owner</code> as arguments. It is
   * also possible to update type specific information for selected payment methods. Please refer to
   * our <a href="/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(String source, SourceUpdateParams params) throws StripeException {
    return update(source, params, (RequestOptions) null);
  }

  /**
   * Updates the specified source by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.
   *
   * <p>This request accepts the <code>metadata</code> and <code>owner</code> as arguments. It is
   * also possible to update type specific information for selected payment methods. Please refer to
   * our <a href="/docs/sources">payment method guides</a> for more detail.
   */
  public Source update(String source, SourceUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/sources/%s", source);
    return request(ApiResource.RequestMethod.POST, url, params, Source.class, options);
  }

  /** Verify a given source. */
  public Source verify(String source, SourceVerifyParams params) throws StripeException {
    return verify(source, params, (RequestOptions) null);
  }

  /** Verify a given source. */
  public Source verify(String source, SourceVerifyParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/sources/%s/verify", source);
    return request(ApiResource.RequestMethod.POST, url, params, Source.class, options);
  }
}
