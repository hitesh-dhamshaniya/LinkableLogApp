package com.github.dhl.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.github.dhl.linkablelog.Log
import kotlinx.android.synthetic.main.sample_fragment.view.*


class SampleFragment : Fragment() {

    companion object {
        fun newInstance() = SampleFragment()
    }

    private lateinit var viewModel: SampleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mRootView = inflater.inflate(R.layout.sample_fragment, container, false)
        val response =
            "{\"glossary\":{\"title\":\"example glossary\",\"GlossDiv\":{\"title\":\"S\",\"GlossList\":{\"GlossEntry\":{\"ID\":\"SGML\",\"SortAs\":\"SGML\",\"GlossTerm\":\"Standard Generalized Markup Language\",\"Acronym\":\"SGML\",\"Abbrev\":\"ISO 8879:1986\",\"GlossDef\":{\"para\":\"A meta-markup language, used to create markup languages such as DocBook.\",\"GlossSeeAlso\":[\"GML\",\"XML\"]},\"GlossSee\":\"markup\"}}}}}"
        mRootView.btnFragmentLog.setOnClickListener {
            Log.e("Fragment", "Fragment Button Click")


            Log.w("Response", response)
        }
        return mRootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SampleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
