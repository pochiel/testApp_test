package com.example.testapp.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.testapp.MainActivity;

/**
 * hellojunitプロジェクトのテスト。
 *
 */
public class TestMain extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;

    // 必須のコンストラクタ
    public TestMain() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        // アクティビティを取得
        mActivity = getActivity();
    }

    public void testAppHello() {
        assertEquals(mActivity.getHelloWorldText("abcdefg"), "Hello world! abcdefg");
    }

}