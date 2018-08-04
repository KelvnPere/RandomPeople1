package ng.com.hellotech.randompeople;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewModel>{
    @NonNull
    @Override
    public UserAdapter.ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewModel holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewModel extends RecyclerView.ViewHolder {
        public ViewModel(View itemView) {
            super(itemView);
        }
    }
}
