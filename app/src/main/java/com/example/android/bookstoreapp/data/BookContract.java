package com.example.android.bookstoreapp.data;

import android.provider.BaseColumns;

/**
 * Created by egi-megi on 06.07.18.
 */

public class BookContract {

    public static abstract class BookDatabaseTitles implements BaseColumns {
        public static final String TABLE_NAME = "books";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_BOOK_TITLE = "TitleBook";
        public static final String COLUMN_BOOK_AUTHOR = "AuthorBook";
        public static final String COLUMN_BOOK_PRICE = "Price";
        public static final String COLUMN_BOOK_QUANTITY = "Quantity";
        public static final String COLUMN_BOOK_SUPPLIER_NAME = "SupplierName";
        public static final String COLUMN_BOOK_SUPPLIER_PHONE = "SupplierPhoneNumber";

    }
}
