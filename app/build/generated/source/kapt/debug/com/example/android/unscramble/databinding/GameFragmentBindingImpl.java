package com.example.android.unscramble.databinding;
import com.example.android.unscramble.R;
import com.example.android.unscramble.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GameFragmentBindingImpl extends GameFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.skip, 2);
        sViewsWithIds.put(R.id.submit, 3);
        sViewsWithIds.put(R.id.textView_instructions, 4);
        sViewsWithIds.put(R.id.word_count, 5);
        sViewsWithIds.put(R.id.score, 6);
        sViewsWithIds.put(R.id.textField, 7);
        sViewsWithIds.put(R.id.text_input_edit_text, 8);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GameFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private GameFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewUnscrambledWord.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameViewModel == variableId) {
            setGameViewModel((com.example.android.unscramble.ui.game.GameViewModel) variable);
        }
        else if (BR.maxNoOfWords == variableId) {
            setMaxNoOfWords((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViewModel(@Nullable com.example.android.unscramble.ui.game.GameViewModel GameViewModel) {
        this.mGameViewModel = GameViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.gameViewModel);
        super.requestRebind();
    }
    public void setMaxNoOfWords(int MaxNoOfWords) {
        this.mMaxNoOfWords = MaxNoOfWords;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGameViewModelCurrentScrambledWord((androidx.lifecycle.LiveData<android.text.Spannable>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGameViewModelCurrentScrambledWord(androidx.lifecycle.LiveData<android.text.Spannable> GameViewModelCurrentScrambledWord, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.text.Spannable gameViewModelCurrentScrambledWordGetValue = null;
        androidx.lifecycle.LiveData<android.text.Spannable> gameViewModelCurrentScrambledWord = null;
        com.example.android.unscramble.ui.game.GameViewModel gameViewModel = mGameViewModel;

        if ((dirtyFlags & 0xbL) != 0) {



                if (gameViewModel != null) {
                    // read gameViewModel.currentScrambledWord
                    gameViewModelCurrentScrambledWord = gameViewModel.getCurrentScrambledWord();
                }
                updateLiveDataRegistration(0, gameViewModelCurrentScrambledWord);


                if (gameViewModelCurrentScrambledWord != null) {
                    // read gameViewModel.currentScrambledWord.getValue()
                    gameViewModelCurrentScrambledWordGetValue = gameViewModelCurrentScrambledWord.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewUnscrambledWord, gameViewModelCurrentScrambledWordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameViewModel.currentScrambledWord
        flag 1 (0x2L): gameViewModel
        flag 2 (0x3L): maxNoOfWords
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}