// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.FileLink;
import com.stripe.model.FileLinkCollection;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.FileLinkCreateParams;
import com.stripe.param.FileLinkListParams;
import com.stripe.param.FileLinkRetrieveParams;
import com.stripe.param.FileLinkUpdateParams;

public class FileLinkService extends ApiService {
  /** Creates a new file link object. */
  public FileLink create(FileLinkCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new file link object. */
  public FileLink create(FileLinkCreateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/file_links");
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }

  /** Returns a list of file links. */
  public FileLinkCollection list(FileLinkListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of file links. */
  public FileLinkCollection list(FileLinkListParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/file_links");
    return requestCollection(url, params, FileLinkCollection.class, options);
  }

  /** Retrieves the file link with the given ID. */
  public FileLink retrieve(String link, FileLinkRetrieveParams params) throws StripeException {
    return retrieve(link, params, (RequestOptions) null);
  }

  /** Retrieves the file link with the given ID. */
  public FileLink retrieve(String link, FileLinkRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/file_links/%s", link);
    return request(ApiResource.RequestMethod.GET, url, params, FileLink.class, options);
  }

  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(String link, FileLinkUpdateParams params) throws StripeException {
    return update(link, params, (RequestOptions) null);
  }

  /** Updates an existing file link object. Expired links can no longer be updated. */
  public FileLink update(String link, FileLinkUpdateParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/file_links/%s", link);
    return request(ApiResource.RequestMethod.POST, url, params, FileLink.class, options);
  }
}
