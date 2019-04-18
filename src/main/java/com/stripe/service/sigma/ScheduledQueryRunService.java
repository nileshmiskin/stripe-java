// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service.sigma;

import com.stripe.exception.StripeException;
import com.stripe.model.sigma.ScheduledQueryRun;
import com.stripe.model.sigma.ScheduledQueryRunCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.sigma.ScheduledQueryRunListParams;
import com.stripe.param.sigma.ScheduledQueryRunRetrieveParams;

public class ScheduledQueryRunService extends ApiService {
  /** Returns a list of scheduled query runs. */
  public ScheduledQueryRunCollection list(ScheduledQueryRunListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of scheduled query runs. */
  public ScheduledQueryRunCollection list(
      ScheduledQueryRunListParams params, RequestOptions options) throws StripeException {
    String url = resourceUrl("/v1/sigma/scheduled_query_runs");
    return requestCollection(url, params, ScheduledQueryRunCollection.class, options);
  }

  /** Retrieves the details of an scheduled query run. */
  public ScheduledQueryRun retrieve(
      String scheduledQueryRun, ScheduledQueryRunRetrieveParams params) throws StripeException {
    return retrieve(scheduledQueryRun, params, (RequestOptions) null);
  }

  /** Retrieves the details of an scheduled query run. */
  public ScheduledQueryRun retrieve(
      String scheduledQueryRun, ScheduledQueryRunRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/sigma/scheduled_query_runs/%s", scheduledQueryRun);
    return request(ApiResource.RequestMethod.GET, url, params, ScheduledQueryRun.class, options);
  }
}
