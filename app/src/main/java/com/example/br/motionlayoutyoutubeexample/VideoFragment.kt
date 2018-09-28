package com.example.br.motionlayoutyoutubeexample


import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_video.*


class VideoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_video, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        videoMotionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {
                val mainActivity = activity as MainActivity
                Log.i("TESTE_WILL", progress.toString())
                if (progress != 0f)
                    mainActivity.mainMotionLayout.progress = Math.abs(progress)
            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {

            }
        })
    }



}
