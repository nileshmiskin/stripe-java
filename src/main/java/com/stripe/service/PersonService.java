// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Person;
import com.stripe.model.PersonCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.PersonCreateParams;
import com.stripe.param.PersonDeleteParams;
import com.stripe.param.PersonListParams;
import com.stripe.param.PersonRetrieveParams;
import com.stripe.param.PersonUpdateParams;

public class PersonService extends ApiService {
  /** Creates a new person. */
  public Person create(String account, PersonCreateParams params) throws StripeException {
    return create(account, params, (RequestOptions) null);
  }

  /** Creates a new person. */
  public Person create(String account, PersonCreateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/accounts/%s/persons", account);
    return request(ApiResource.RequestMethod.POST, url, params, Person.class, options);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(String account, String person, PersonDeleteParams params)
      throws StripeException {
    return delete(account, person, params, (RequestOptions) null);
  }

  /** Deletes an existing person’s relationship to the account’s legal entity. */
  public Person delete(
      String account, String person, PersonDeleteParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/accounts/%s/persons/%s", account, person);
    return request(ApiResource.RequestMethod.DELETE, url, params, Person.class, options);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(String account, PersonListParams params) throws StripeException {
    return list(account, params, (RequestOptions) null);
  }

  /**
   * Returns a list of people associated with the account’s legal entity. The people are returned
   * sorted by creation date, with the most recent people appearing first.
   */
  public PersonCollection list(String account, PersonListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/accounts/%s/persons", account);
    return requestCollection(url, params, PersonCollection.class, options);
  }

  /** Retrieves an existing person. */
  public Person retrieve(String account, String person, PersonRetrieveParams params)
      throws StripeException {
    return retrieve(account, person, params, (RequestOptions) null);
  }

  /** Retrieves an existing person. */
  public Person retrieve(
      String account, String person, PersonRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/accounts/%s/persons/%s", account, person);
    return request(ApiResource.RequestMethod.GET, url, params, Person.class, options);
  }

  /** Updates an existing person. */
  public Person update(String account, String person, PersonUpdateParams params)
      throws StripeException {
    return update(account, person, params, (RequestOptions) null);
  }

  /** Updates an existing person. */
  public Person update(
      String account, String person, PersonUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/accounts/%s/persons/%s", account, person);
    return request(ApiResource.RequestMethod.POST, url, params, Person.class, options);
  }
}
