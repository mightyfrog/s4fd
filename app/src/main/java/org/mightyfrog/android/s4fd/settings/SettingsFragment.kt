package org.mightyfrog.android.s4fd.settings

import android.content.Intent
import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import org.mightyfrog.android.s4fd.R

/**
 * @author Shigehiro Soejima
 */
class SettingsFragment : PreferenceFragmentCompat() {

    companion object {
        val TAG: String = SettingsFragment::class.java.simpleName

        fun newInstance(b: Bundle?): SettingsFragment = SettingsFragment().apply {
            arguments = b
        }
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.prefs)
    }

    override fun onPreferenceTreeClick(preference: Preference?): Boolean {
        when (preference?.key) {
            "open_source" -> startActivity(Intent(context, OssLicensesMenuActivity::class.java))
        }

        return super.onPreferenceTreeClick(preference)
    }
}