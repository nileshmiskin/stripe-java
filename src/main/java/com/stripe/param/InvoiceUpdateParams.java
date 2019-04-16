// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceUpdateParams extends ApiRequestParams {
  /**
   * A fee in %s that will be applied to the invoice and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
   * order to take an application fee. For more information, see the application fees
   * [documentation](https://stripe.com/docs/connect/subscriptions#invoices).
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Controls whether Stripe will perform [automatic
   * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
   */
  @SerializedName("auto_advance")
  Boolean autoAdvance;

  /**
   * A list of up to 4 custom fields to be displayed on the invoice. If a value for `custom_fields`
   * is specified, the list specified will replace the existing custom field list on this invoice.
   */
  @SerializedName("custom_fields")
  Object customFields;

  /**
   * The number of days from which the invoice is created until it is due. Only valid for invoices
   * where `billing=send_invoice`. This field can only be updated on `draft` invoices.
   */
  @SerializedName("days_until_due")
  Long daysUntilDue;

  /**
   * ID of the default payment method for the invoice. It must belong to the customer associated
   * with the invoice. If not set, defaults to the subscription's default payment method, if any, or
   * to the default payment method in the customer's invoice settings.
   */
  @SerializedName("default_payment_method")
  String defaultPaymentMethod;

  /**
   * ID of the default payment source for the invoice. It must belong to the customer associated
   * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
   * default source, if any, or to the customer's default source.
   */
  @SerializedName("default_source")
  String defaultSource;

  @SerializedName("description")
  String description;

  /**
   * The date on which payment for this invoice is due. Only valid for invoices where
   * `billing=send_invoice`. This field can only be updated on `draft` invoices.
   */
  @SerializedName("due_date")
  Long dueDate;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** Footer to be displayed on the invoice. */
  @SerializedName("footer")
  String footer;

  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * Extra information about a charge for the customer's credit card statement. It must contain at
   * least one letter. If not specified and this invoice is part of a subscription, the default
   * `statement_descriptor` will be set to the first subscription item's product's
   * `statement_descriptor`.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The percent tax rate applied to the invoice, represented as a non-negative decimal number (with
   * at most four decimal places) between 0 and 100. To unset a previously-set value, pass an empty
   * string. This field can be updated only on `draft` invoices.
   */
  @SerializedName("tax_percent")
  Object taxPercent;

  /**
   * If specified, the funds from the invoice will be transferred to the destination and the ID of
   * the resulting transfer will be found on the invoice's charge. This will be unset if you POST an
   * empty value.
   */
  @SerializedName("transfer_data")
  Object transferData;

  private InvoiceUpdateParams(
      Long applicationFeeAmount,
      Boolean autoAdvance,
      Object customFields,
      Long daysUntilDue,
      String defaultPaymentMethod,
      String defaultSource,
      String description,
      Long dueDate,
      List<String> expand,
      String footer,
      Map<String, String> metadata,
      String statementDescriptor,
      Object taxPercent,
      Object transferData) {
    this.applicationFeeAmount = applicationFeeAmount;
    this.autoAdvance = autoAdvance;
    this.customFields = customFields;
    this.daysUntilDue = daysUntilDue;
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.defaultSource = defaultSource;
    this.description = description;
    this.dueDate = dueDate;
    this.expand = expand;
    this.footer = footer;
    this.metadata = metadata;
    this.statementDescriptor = statementDescriptor;
    this.taxPercent = taxPercent;
    this.transferData = transferData;
  }

  public static Builder builder() {
    return new com.stripe.param.InvoiceUpdateParams.Builder();
  }

  public static class Builder {
    private Long applicationFeeAmount;

    private Boolean autoAdvance;

    private Object customFields;

    private Long daysUntilDue;

    private String defaultPaymentMethod;

    private String defaultSource;

    private String description;

    private Long dueDate;

    private List<String> expand;

    private String footer;

    private Map<String, String> metadata;

    private String statementDescriptor;

    private Object taxPercent;

    private Object transferData;

    /** Finalize and obtain parameter instance from this builder. */
    public InvoiceUpdateParams build() {
      return new InvoiceUpdateParams(
          this.applicationFeeAmount,
          this.autoAdvance,
          this.customFields,
          this.daysUntilDue,
          this.defaultPaymentMethod,
          this.defaultSource,
          this.description,
          this.dueDate,
          this.expand,
          this.footer,
          this.metadata,
          this.statementDescriptor,
          this.taxPercent,
          this.transferData);
    }

    /**
     * A fee in %s that will be applied to the invoice and transferred to the application owner's
     * Stripe account. The request must be made with an OAuth key or the Stripe-Account header in
     * order to take an application fee. For more information, see the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#invoices).
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Controls whether Stripe will perform [automatic
     * collection](https://stripe.com/docs/billing/invoices/workflow/#auto_advance) of the invoice.
     */
    public Builder setAutoAdvance(Boolean autoAdvance) {
      this.autoAdvance = autoAdvance;
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for
     * `custom_fields` is specified, the list specified will replace the existing custom field list
     * on this invoice.
     */
    public Builder setCustomFields(EmptyParam customFields) {
      this.customFields = customFields;
      return this;
    }

    /**
     * A list of up to 4 custom fields to be displayed on the invoice. If a value for
     * `custom_fields` is specified, the list specified will replace the existing custom field list
     * on this invoice.
     */
    public Builder setCustomFields(List<CustomField> customFields) {
      this.customFields = customFields;
      return this;
    }

    /**
     * The number of days from which the invoice is created until it is due. Only valid for invoices
     * where `billing=send_invoice`. This field can only be updated on `draft` invoices.
     */
    public Builder setDaysUntilDue(Long daysUntilDue) {
      this.daysUntilDue = daysUntilDue;
      return this;
    }

    /**
     * ID of the default payment method for the invoice. It must belong to the customer associated
     * with the invoice. If not set, defaults to the subscription's default payment method, if any,
     * or to the default payment method in the customer's invoice settings.
     */
    public Builder setDefaultPaymentMethod(String defaultPaymentMethod) {
      this.defaultPaymentMethod = defaultPaymentMethod;
      return this;
    }

    /**
     * ID of the default payment source for the invoice. It must belong to the customer associated
     * with the invoice and be in a chargeable state. If not set, defaults to the subscription's
     * default source, if any, or to the customer's default source.
     */
    public Builder setDefaultSource(String defaultSource) {
      this.defaultSource = defaultSource;
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * The date on which payment for this invoice is due. Only valid for invoices where
     * `billing=send_invoice`. This field can only be updated on `draft` invoices.
     */
    public Builder setDueDate(Long dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * InvoiceUpdateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** Footer to be displayed on the invoice. */
    public Builder setFooter(String footer) {
      this.footer = footer;
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * InvoiceUpdateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link InvoiceUpdateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * Extra information about a charge for the customer's credit card statement. It must contain at
     * least one letter. If not specified and this invoice is part of a subscription, the default
     * `statement_descriptor` will be set to the first subscription item's product's
     * `statement_descriptor`.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * The percent tax rate applied to the invoice, represented as a non-negative decimal number
     * (with at most four decimal places) between 0 and 100. To unset a previously-set value, pass
     * an empty string. This field can be updated only on `draft` invoices.
     */
    public Builder setTaxPercent(EmptyParam taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * The percent tax rate applied to the invoice, represented as a non-negative decimal number
     * (with at most four decimal places) between 0 and 100. To unset a previously-set value, pass
     * an empty string. This field can be updated only on `draft` invoices.
     */
    public Builder setTaxPercent(BigDecimal taxPercent) {
      this.taxPercent = taxPercent;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * If specified, the funds from the invoice will be transferred to the destination and the ID of
     * the resulting transfer will be found on the invoice's charge. This will be unset if you POST
     * an empty value.
     */
    public Builder setTransferData(EmptyParam transferData) {
      this.transferData = transferData;
      return this;
    }
  }

  public static class CustomField {
    /** The name of the custom field. This may be up to 30 characters. */
    @SerializedName("name")
    String name;

    /** The value of the custom field. This may be up to 30 characters. */
    @SerializedName("value")
    String value;

    private CustomField(String name, String value) {
      this.name = name;
      this.value = value;
    }

    public static Builder builder() {
      return new com.stripe.param.InvoiceUpdateParams.CustomField.Builder();
    }

    public static class Builder {
      private String name;

      private String value;

      /** Finalize and obtain parameter instance from this builder. */
      public CustomField build() {
        return new CustomField(this.name, this.value);
      }

      /** The name of the custom field. This may be up to 30 characters. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** The value of the custom field. This may be up to 30 characters. */
      public Builder setValue(String value) {
        this.value = value;
        return this;
      }
    }
  }

  public static class TransferData {
    /** ID of an existing, connected Stripe account. */
    @SerializedName("destination")
    String destination;

    private TransferData(String destination) {
      this.destination = destination;
    }

    public static Builder builder() {
      return new com.stripe.param.InvoiceUpdateParams.TransferData.Builder();
    }

    public static class Builder {
      private String destination;

      /** Finalize and obtain parameter instance from this builder. */
      public TransferData build() {
        return new TransferData(this.destination);
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }
    }
  }
}
