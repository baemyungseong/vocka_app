// Generated by view binder compiler. Do not edit!
package com.example.vocabapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.vocabapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLearnBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView definition;

  @NonNull
  public final ImageButton learnThisWord;

  @NonNull
  public final ImageView line;

  @NonNull
  public final ImageButton nextWord;

  @NonNull
  public final TextView phonetic;

  @NonNull
  public final ImageButton reviewWords;

  @NonNull
  public final ImageButton voice;

  @NonNull
  public final TextView word;

  @NonNull
  public final ImageView wordHolder;

  @NonNull
  public final TextView wordtype;

  private FragmentLearnBinding(@NonNull RelativeLayout rootView, @NonNull TextView definition,
      @NonNull ImageButton learnThisWord, @NonNull ImageView line, @NonNull ImageButton nextWord,
      @NonNull TextView phonetic, @NonNull ImageButton reviewWords, @NonNull ImageButton voice,
      @NonNull TextView word, @NonNull ImageView wordHolder, @NonNull TextView wordtype) {
    this.rootView = rootView;
    this.definition = definition;
    this.learnThisWord = learnThisWord;
    this.line = line;
    this.nextWord = nextWord;
    this.phonetic = phonetic;
    this.reviewWords = reviewWords;
    this.voice = voice;
    this.word = word;
    this.wordHolder = wordHolder;
    this.wordtype = wordtype;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLearnBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLearnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_learn, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLearnBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.definition;
      TextView definition = rootView.findViewById(id);
      if (definition == null) {
        break missingId;
      }

      id = R.id.learn_this_word;
      ImageButton learnThisWord = rootView.findViewById(id);
      if (learnThisWord == null) {
        break missingId;
      }

      id = R.id.line;
      ImageView line = rootView.findViewById(id);
      if (line == null) {
        break missingId;
      }

      id = R.id.next_word;
      ImageButton nextWord = rootView.findViewById(id);
      if (nextWord == null) {
        break missingId;
      }

      id = R.id.phonetic;
      TextView phonetic = rootView.findViewById(id);
      if (phonetic == null) {
        break missingId;
      }

      id = R.id.review_words;
      ImageButton reviewWords = rootView.findViewById(id);
      if (reviewWords == null) {
        break missingId;
      }

      id = R.id.voice;
      ImageButton voice = rootView.findViewById(id);
      if (voice == null) {
        break missingId;
      }

      id = R.id.word;
      TextView word = rootView.findViewById(id);
      if (word == null) {
        break missingId;
      }

      id = R.id.word_holder;
      ImageView wordHolder = rootView.findViewById(id);
      if (wordHolder == null) {
        break missingId;
      }

      id = R.id.wordtype;
      TextView wordtype = rootView.findViewById(id);
      if (wordtype == null) {
        break missingId;
      }

      return new FragmentLearnBinding((RelativeLayout) rootView, definition, learnThisWord, line,
          nextWord, phonetic, reviewWords, voice, word, wordHolder, wordtype);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
