package com.example.android.unscramble.ui.game;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00040\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00040\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/android/unscramble/ui/game/GameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_count", "", "_currentScrambledWord", "Landroidx/lifecycle/MutableLiveData;", "", "_currentWordCount", "kotlin.jvm.PlatformType", "_score", "count", "getCount", "()I", "currentScrambledWord", "Landroidx/lifecycle/LiveData;", "Landroid/text/Spannable;", "getCurrentScrambledWord", "()Landroidx/lifecycle/LiveData;", "currentWord", "currentWordCount", "getCurrentWordCount", "score", "getScore", "wordsList", "", "getNextWord", "", "increaseScore", "isUserWordCorrect", "", "playerWord", "nextWord", "reinitializeData", "app_debug"})
public final class GameViewModel extends androidx.lifecycle.ViewModel {
    private java.util.List<java.lang.String> wordsList;
    private java.lang.String currentWord;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _score = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _currentWordCount = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _currentScrambledWord = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.text.Spannable> currentScrambledWord = null;
    private int _count = 0;
    
    public GameViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getScore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCurrentWordCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.text.Spannable> getCurrentScrambledWord() {
        return null;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void getNextWord() {
    }
    
    private final void increaseScore() {
    }
    
    public final boolean isUserWordCorrect(@org.jetbrains.annotations.NotNull()
    java.lang.String playerWord) {
        return false;
    }
    
    public final boolean nextWord() {
        return false;
    }
    
    public final void reinitializeData() {
    }
}