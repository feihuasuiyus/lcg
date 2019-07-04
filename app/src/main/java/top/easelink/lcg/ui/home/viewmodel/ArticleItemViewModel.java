/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package top.easelink.lcg.ui.home.viewmodel;

import androidx.databinding.ObservableField;
import top.easelink.lcg.ui.home.model.Article;

public class ArticleItemViewModel {

    private final ArticleItemViewModelListener mListener;

    public final ObservableField<String> title;

    private final Article article;

    public ArticleItemViewModel(Article article, ArticleItemViewModelListener listener) {
        this.article = article;
        this.mListener = listener;
        title = new ObservableField<>(article.getTitle());
    }

    public void onItemClick() {
    }

    public interface ArticleItemViewModelListener {

        void onItemClick(String blogUrl);
    }
}
