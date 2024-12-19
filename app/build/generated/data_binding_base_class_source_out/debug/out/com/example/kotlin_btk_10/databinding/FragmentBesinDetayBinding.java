// Generated by view binder compiler. Do not edit!
package com.example.kotlin_btk_10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kotlin_btk_10.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBesinDetayBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView besinImage;

  @NonNull
  public final TextView besinIsim;

  @NonNull
  public final TextView besinKalori;

  @NonNull
  public final TextView besinKarbonhidrat;

  @NonNull
  public final TextView besinProtein;

  @NonNull
  public final TextView besinYa;

  private FragmentBesinDetayBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView besinImage, @NonNull TextView besinIsim, @NonNull TextView besinKalori,
      @NonNull TextView besinKarbonhidrat, @NonNull TextView besinProtein,
      @NonNull TextView besinYa) {
    this.rootView = rootView;
    this.besinImage = besinImage;
    this.besinIsim = besinIsim;
    this.besinKalori = besinKalori;
    this.besinKarbonhidrat = besinKarbonhidrat;
    this.besinProtein = besinProtein;
    this.besinYa = besinYa;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBesinDetayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBesinDetayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_besin_detay, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBesinDetayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.besinImage;
      ImageView besinImage = ViewBindings.findChildViewById(rootView, id);
      if (besinImage == null) {
        break missingId;
      }

      id = R.id.besinIsim;
      TextView besinIsim = ViewBindings.findChildViewById(rootView, id);
      if (besinIsim == null) {
        break missingId;
      }

      id = R.id.besinKalori;
      TextView besinKalori = ViewBindings.findChildViewById(rootView, id);
      if (besinKalori == null) {
        break missingId;
      }

      id = R.id.besinKarbonhidrat;
      TextView besinKarbonhidrat = ViewBindings.findChildViewById(rootView, id);
      if (besinKarbonhidrat == null) {
        break missingId;
      }

      id = R.id.besinProtein;
      TextView besinProtein = ViewBindings.findChildViewById(rootView, id);
      if (besinProtein == null) {
        break missingId;
      }

      id = R.id.besinYağ;
      TextView besinYa = ViewBindings.findChildViewById(rootView, id);
      if (besinYa == null) {
        break missingId;
      }

      return new FragmentBesinDetayBinding((ConstraintLayout) rootView, besinImage, besinIsim,
          besinKalori, besinKarbonhidrat, besinProtein, besinYa);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}