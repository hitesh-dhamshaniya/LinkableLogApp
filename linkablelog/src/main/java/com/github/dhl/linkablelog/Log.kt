package com.github.dhl.linkablelog

import android.util.Log

/**
 * @author Hitesh
 * @version 1.0
 * @since 28-09-2019
 */
class Log {

    companion object {
        /**
         * @param TAG String
         * @param param any
         * @return unit
         */
        fun d(TAG: String, param: Any?) {
            Log.d(TAG, getLog(param))
        }

        /**
         * @param TAG String
         * @param param any
         * @return unit
         */
        fun e(TAG: String, param: Any?) {
            Log.e(TAG, getLog(param))
        }

        /**
         * @param TAG String
         * @param param any
         * @return unit
         */
        fun i(TAG: String, param: Any?) {
            Log.i(TAG, getLog(param))
        }

        /**
         * @param TAG String
         * @param param any
         * @return unit
         */
        fun w(TAG: String, param: Any?) {
            Log.w(TAG, getLog(param))
        }

        /**
         * @param TAG String
         * @param param any
         * @return unit
         */
        fun v(TAG: String, param: Any?) {
            Log.v(TAG, getLog(param))
        }

        private fun getLog(param: Any?): String {

            val strBuilder = StringBuilder()

            //Get Last 3 Stack Trace
            val stack = Thread.currentThread().stackTrace[4]

            strBuilder.append(param)

            //Append Line Number
            strBuilder.append("\t(")
                .append(stack.fileName)
                .append(':')
                .append(stack.lineNumber)
                .append(')')

            return strBuilder.toString()
        }
    }
}