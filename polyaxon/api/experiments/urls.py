from rest_framework.urlpatterns import format_suffix_patterns

from django.urls import re_path

from api.bookmarks import views as bookmark_views
from api.experiments import views
from constants.urls import (
    EXPERIMENT_ID_PATTERN,
    ID_PATTERN,
    NAME_PATTERN,
    USERNAME_PATTERN,
    UUID_PATTERN
)

experiments_urlpatterns = [
    # Get all experiments
    re_path(r'^experiments/?$', views.ExperimentListView.as_view()),
    re_path(r'^{}/{}/experiments/stop/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN),
        views.ExperimentStopManyView.as_view()),
    re_path(r'^{}/{}/experiments/delete/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN),
        views.ExperimentDeleteManyView.as_view()),
    re_path(r'^{}/{}/experiments/{}/?$'.format(USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
            views.ExperimentDetailView.as_view()),
    re_path(r'^{}/{}/experiments/{}/restart/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
        views.ExperimentRestartView.as_view()),
    re_path(r'^{}/{}/experiments/{}/resume/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
        views.ExperimentResumeView.as_view()),
    re_path(r'^{}/{}/experiments/{}/copy/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
        views.ExperimentCopyView.as_view()),
    re_path(r'^{}/{}/experiments/{}/coderef/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
        views.ExperimentCodeReferenceView.as_view()),
    re_path(r'^{}/{}/experiments/{}/statuses/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
        views.ExperimentStatusListView.as_view()),
    re_path(r'^{}/{}/experiments/{}/statuses/{}/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN, UUID_PATTERN),
        views.ExperimentStatusDetailView.as_view()),
    re_path(r'^{}/{}/experiments/{}/metrics/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
        views.ExperimentMetricListView.as_view()),
    re_path(r'^{}/{}/experiments/{}/chartviews/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
        views.ExperimentChartViewListView.as_view()),
    re_path(r'^{}/{}/experiments/{}/chartviews/{}/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN, ID_PATTERN),
        views.ExperimentChartViewDetailView.as_view()),
    re_path(r'^{}/{}/experiments/{}/jobs/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
        views.ExperimentJobListView.as_view()),
    re_path(r'^{}/{}/experiments/{}/logs/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
        views.ExperimentLogsView.as_view()),
    re_path(r'^{}/{}/experiments/{}/stop/?$'.format(USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
            views.ExperimentStopView.as_view()),
    re_path(r'^{}/{}/experiments/{}/outputs/download/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
            views.ExperimentDownloadOutputsView.as_view()),
    re_path(r'^{}/{}/experiments/{}/outputs/tree/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
            views.ExperimentOutputsTreeView.as_view()),
    re_path(r'^{}/{}/experiments/{}/outputs/files/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
            views.ExperimentOutputsFilesView.as_view()),
    re_path(r'^{}/{}/experiments/{}/bookmark/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
        bookmark_views.ExperimentBookmarkCreateView.as_view()),
    re_path(r'^{}/{}/experiments/{}/unbookmark/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
        bookmark_views.ExperimentBookmarkDeleteView.as_view()),
    re_path(r'^{}/{}/experiments/{}/token/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, ID_PATTERN),
        views.ExperimentScopeTokenView.as_view()),
    re_path(r'^{}/{}/experiments/{}/_heartbeat/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN),
        views.ExperimentHeartBeatView.as_view()),
]

jobs_urlpatterns = [
    re_path(r'^{}/{}/experiments/{}/jobs/{}/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN, ID_PATTERN),
        views.ExperimentJobDetailView.as_view()),
    re_path(r'^{}/{}/experiments/{}/jobs/{}/statuses/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN, ID_PATTERN),
        views.ExperimentJobStatusListView.as_view()),
    re_path(r'^{}/{}/experiments/{}/jobs/{}/statuses/{}/?$'.format(
        USERNAME_PATTERN, NAME_PATTERN, EXPERIMENT_ID_PATTERN, ID_PATTERN,
        UUID_PATTERN),
        views.ExperimentJobStatusDetailView.as_view()),
]

urlpatterns = format_suffix_patterns(experiments_urlpatterns + jobs_urlpatterns)
