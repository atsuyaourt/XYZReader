package com.example.xyzreader.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.format.DateUtils;

/**
 * Created by yoh268 on 8/1/2016.
 */
public class Utils {

    public static Spanned formatArticleByLine(long date, String author) {
        String dateStr = DateUtils.getRelativeTimeSpanString(
                date, System.currentTimeMillis(), DateUtils.HOUR_IN_MILLIS,
                DateUtils.FORMAT_ABBREV_ALL).toString();

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            return Html.fromHtml(dateStr + " by " + author, Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml(dateStr + " by " + author);
        }

    }

    public static Spanned formatArticleBody(String body) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            return Html.fromHtml(body, Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml(body);
        }

    }
}
