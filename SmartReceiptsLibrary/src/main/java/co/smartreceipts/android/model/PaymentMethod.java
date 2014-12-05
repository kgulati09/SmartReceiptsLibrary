package co.smartreceipts.android.model;

import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * This interface establishes the contract for encapsulating the behavior of different payment models.
 *
 * @author Will Baumann
 */
public interface PaymentMethod extends Parcelable {

    /**
     * @return - the database primary key id for this method
     */
    int getId();

    /**
     * @return - the actual payment method that the user specified
     */
    @NonNull
    String getMethod();

}
